package w21;

/* renamed from: w21.o */
public enum C102318o {
    NONE("", "", "", "", false, false),
    NOTEUL("<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", false, true),
    NOTEOL("<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", false, true),
    NOTETODO("", "", "<wn-todo checked=\"1\" >", "</wn-todo>", false, true);
    

    /* renamed from: d */
    public String f301342d;

    /* renamed from: e */
    public String f301343e;

    /* renamed from: f */
    public boolean f301344f;

    /* renamed from: g */
    public String f301345g;

    /* renamed from: h */
    public String f301346h;

    /* renamed from: i */
    public boolean f301347i;

    /* renamed from: j */
    public boolean f301348j;

    /* access modifiers changed from: public */
    C102318o(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f301348j = false;
        this.f301342d = str;
        this.f301343e = str2;
        this.f301345g = str3;
        this.f301346h = str4;
        this.f301344f = z;
        this.f301347i = z2;
    }

    /* renamed from: a */
    public boolean mo141868a() {
        return this == NOTETODO;
    }
}
