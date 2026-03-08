import org.atlanmod.commons.dao.Repository;

module org.atlanmod.commons.main.module {
    requires org.atlanmod.commons.dao.module;
    requires org.atlanmod.commons.entity.module;
    requires org.atlanmod.commons.user.dao.module;

    uses Repository;
}