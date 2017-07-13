package demo

class Group {
    String name
    User user
    static constraints = {
        name unique: 'user'
    }

    static mapping = {
        table name: 'my_group'
    }
}
