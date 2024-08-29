package August.ex_18082024.CollectionFramework;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        List shopping_list = List.of("Milk","Bread","Butter","Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        shopping_list.add("Apple");



    }
}
//[Milk, Bread, Butter, Cheese]
//4
//Exception in thread "main" java.lang.UnsupportedOperationException
//	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
//	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
//	at August.ex_18082024.CollectionFramework.Lab231.main(Lab231.java:10)