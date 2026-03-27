package factory;

import domain.Member;

public class MemberFactory {
    public static Member createMember(String memberId, String userName, String email,
                                      String contactNumber){
        return new Member.Builder()
                .setMemberId(memberId)
                .setUserName(userName)
                .setEmail(email)
                .setContactNumber(contactNumber)
                .build();
    }
}
