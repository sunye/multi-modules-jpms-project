import org.atlanmod.commons.userdao.UserDao;
import org.atlanmod.commons.dao.Repository;

module org.atlanmod.commons.user.dao.module {
    exports org.atlanmod.commons.userdao;
    requires org.atlanmod.commons.entity.module;
    requires org.atlanmod.commons.dao.module;
    provides Repository with UserDao;
}