package MemberList;

public interface MemberManager {
    int add(Member member);

    Member search(int id);

    void viewAllMember();
}
