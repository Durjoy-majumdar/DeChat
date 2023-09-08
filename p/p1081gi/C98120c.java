package p1081gi;

/* renamed from: gi.c */
public class C98120c {

    /* renamed from: a */
    public String f287607a;
    public long field_finishedLength;
    public boolean field_isUploadTask = false;
    public boolean field_mtlnotify;
    public int field_status;
    public long field_toltalLength;

    public String toString() {
        return String.format("id:%s total:%d finLen:%d status:%d,mtl:%b, upload:%b", new Object[]{this.f287607a, Long.valueOf(this.field_toltalLength), Long.valueOf(this.field_finishedLength), Integer.valueOf(this.field_status), Boolean.valueOf(this.field_mtlnotify), Boolean.valueOf(this.field_isUploadTask)});
    }
}
