
import domain.Member;
import factory.MemberFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MemberFactoryTest {

    Member member;

    @BeforeEach
    void setUp() {
        member = MemberFactory.createMember("1434D", "Jacob_Malik",
                "jacobmalik@gmail.com", "+27 73 458 1902");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createMember(){
        assertNotNull(member);
    }



}
