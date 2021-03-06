package app.doggy.newmybrary

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Record(
    @PrimaryKey open var id: String = UUID.randomUUID().toString(),
    open var bookId: String = "",
    open var bookPageCount: Int = 1,
    open var currentPage: Int = 0,
    open var comment1: String = "",
    open var comment2: String = "",
    open var comment3: String = "",
    open var createdAt: Date = Date(System.currentTimeMillis())
): RealmObject()