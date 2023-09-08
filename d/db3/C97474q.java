package db3;

/* renamed from: db3.q */
public enum C97474q {
    NONE("", "", "", "", false, false),
    NOTEUL("<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", false, true),
    NOTEOL("<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", false, true),
    NOTETODO("", "", "<wn-todo checked=\"1\" >", "</wn-todo>", false, true);
    

    /* renamed from: d */
    public String f286096d;

    /* renamed from: e */
    public String f286097e;

    /* renamed from: f */
    public boolean f286098f;

    /* renamed from: g */
    public String f286099g;

    /* renamed from: h */
    public String f286100h;

    /* renamed from: i */
    public boolean f286101i;

    /* renamed from: j */
    public boolean f286102j;

    /* access modifiers changed from: public */
    C97474q(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f286102j = false;
        this.f286096d = str;
        this.f286097e = str2;
        this.f286099g = str3;
        this.f286100h = str4;
        this.f286098f = z;
        this.f286101i = z2;
    }

    /* renamed from: a */
    public boolean mo136740a() {
        return this == NOTETODO;
    }
}
