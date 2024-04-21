package MemberList;

public class MemberList implements MemberManager {
    private Member members[];
    private int index;

    public MemberList(int size) {
        members = new Member[size];
        index = 0;
    }

    public int add(Member member) {
        if (index >= members.length) {
            throw new ArrayIndexOutOfBoundsException("Can't add more");
        }
        members[index++] = member;
        System.out.println(member.getName() + " Added to Memberlist");
        return index - 1;
    }

    public Member getMember(int id) {
        if (id >= index) {
            throw new ArrayIndexOutOfBoundsException("Wrong id!");
        }
        return members[id];
    }

    public void displayMember(int id) {
        if (id >= index) {
            throw new ArrayIndexOutOfBoundsException("Wrong id!");
        }
        System.out.println("Name: " + members[id].getName());
        System.out.println("DOB: " + members[id].getDob());
        System.out.println("Issued Book count: " + members[id].getBook_issued_count());
    }

    public void displayAllMembers() {
        for (int i = 0; i < index; i++) {
            System.out.println("...........");
            displayMember(i);
            System.out.println("...........");
        }
        System.out.println();
    }

    @Override
    public Member search(int id) {
        return getMember(id);
    }

    @Override
    public void viewAllMember() {
        displayAllMembers();
    }
}
