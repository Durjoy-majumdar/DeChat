package op3;

/* renamed from: op3.j */
public class C117882j {

    /* renamed from: a */
    public Object[] f352402a;

    /* renamed from: b */
    public static <$1> C117876a<$1> m166283b($1 _1) {
        C117876a<$1> aVar = new C117876a<>();
        aVar.f352402a = new Object[]{_1};
        return aVar;
    }

    /* renamed from: c */
    public static <$1, $2> C117877b<$1, $2> m166284c($1 _1, $2 _2) {
        C117877b<$1, $2> bVar = new C117877b<>();
        bVar.f352402a = new Object[]{_1, _2};
        return bVar;
    }

    /* renamed from: d */
    public static <$1, $2, $3> C117878c<$1, $2, $3> m166285d($1 _1, $2 _2, $3 _3) {
        C117878c<$1, $2, $3> cVar = new C117878c<>();
        cVar.f352402a = new Object[]{_1, _2, _3};
        return cVar;
    }

    /* renamed from: e */
    public static <$1, $2, $3, $4> C117879d<$1, $2, $3, $4> m166286e($1 _1, $2 _2, $3 _3, $4 _4) {
        C117879d<$1, $2, $3, $4> dVar = new C117879d<>();
        dVar.f352402a = new Object[]{_1, _2, _3, _4};
        return dVar;
    }

    /* renamed from: f */
    public static <$1, $2, $3, $4, $5> C117880e<$1, $2, $3, $4, $5> m166287f($1 _1, $2 _2, $3 _3, $4 _4, $5 _5) {
        C117880e<$1, $2, $3, $4, $5> eVar = new C117880e<>();
        eVar.f352402a = new Object[]{_1, _2, _3, _4, _5};
        return eVar;
    }

    /* renamed from: a */
    public <T> T mo182596a(int i) {
        T[] tArr = this.f352402a;
        if (tArr.length <= i) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: g */
    public int mo182597g() {
        Object[] objArr = this.f352402a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : this.f352402a) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
