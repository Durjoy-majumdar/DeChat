package t91;

import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.List;
import pe3.C89349b;

/* renamed from: t91.l */
public final class C36981l {

    /* renamed from: a */
    public Field f98066a;

    /* renamed from: b */
    public Field f98067b;

    /* renamed from: c */
    public Field f98068c;

    /* renamed from: d */
    public Field f98069d;

    /* renamed from: e */
    public Field f98070e;

    /* renamed from: t91.l$a */
    public static final class C36982a {

        /* renamed from: a */
        public List<?> f98071a;

        /* renamed from: b */
        public C89349b f98072b;

        /* renamed from: c */
        public int f98073c;

        /* renamed from: d */
        public boolean f98074d;

        /* renamed from: e */
        public boolean f98075e;

        public C36982a() {
            this((List<?>) null, (C89349b) null, -1, true, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36982a)) {
                return false;
            }
            C36982a aVar = (C36982a) obj;
            return C87412m.m108589b(this.f98071a, aVar.f98071a) && C87412m.m108589b(this.f98072b, aVar.f98072b) && this.f98073c == aVar.f98073c && this.f98074d == aVar.f98074d && this.f98075e == aVar.f98075e;
        }

        public int hashCode() {
            List<?> list = this.f98071a;
            int i = 0;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            C89349b bVar = this.f98072b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + this.f98073c) * 31;
            boolean z = this.f98074d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f98075e;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "ArgsOnFetchDone(incrementList=" + this.f98071a + ", lastBuffer=" + this.f98072b + ", pullType=" + this.f98073c + ", hasMore=" + this.f98074d + ", isNeedClear=" + this.f98075e + ')';
        }

        public C36982a(List<?> list, C89349b bVar, int i, boolean z, boolean z2) {
            this.f98071a = list;
            this.f98072b = bVar;
            this.f98073c = i;
            this.f98074d = z;
            this.f98075e = z2;
        }
    }

    public C36981l() {
        Class<IResponse> cls = IResponse.class;
        try {
            Field declaredField = cls.getDeclaredField("incrementList");
            C87412m.m108593f(declaredField, "clazz.getDeclaredField(\"incrementList\")");
            this.f98066a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("lastBuffer");
            C87412m.m108593f(declaredField2, "clazz.getDeclaredField(\"lastBuffer\")");
            this.f98067b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("pullType");
            C87412m.m108593f(declaredField3, "clazz.getDeclaredField(\"pullType\")");
            this.f98068c = declaredField3;
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("hasMore");
            C87412m.m108593f(declaredField4, "clazz.getDeclaredField(\"hasMore\")");
            this.f98069d = declaredField4;
            declaredField4.setAccessible(true);
            Field declaredField5 = cls.getDeclaredField("isNeedClear");
            C87412m.m108593f(declaredField5, "clazz.getDeclaredField(\"isNeedClear\")");
            this.f98070e = declaredField5;
            declaredField5.setAccessible(true);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.RefreshLoadMoreCallback", e, "init crash: " + e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final C36982a mo60923a(Object[] objArr) {
        C87412m.m108594g(objArr, "args");
        Object obj = objArr[0];
        try {
            Field field = this.f98066a;
            if (field != null) {
                Object obj2 = field.get(obj);
                List list = obj2 instanceof List ? (List) obj2 : null;
                Field field2 = this.f98067b;
                if (field2 != null) {
                    Object obj3 = field2.get(obj);
                    C89349b bVar = obj3 == null ? null : (C89349b) obj3;
                    Field field3 = this.f98068c;
                    if (field3 != null) {
                        Object obj4 = field3.get(obj);
                        C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj4).intValue();
                        Field field4 = this.f98069d;
                        if (field4 != null) {
                            Object obj5 = field4.get(obj);
                            C87412m.m108592e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            Field field5 = this.f98070e;
                            if (field5 != null) {
                                Object obj6 = field5.get(obj);
                                C87412m.m108592e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                                return new C36982a(list, bVar, intValue, booleanValue, ((Boolean) obj6).booleanValue());
                            }
                            C87412m.m108603p("isNeedClear_Field");
                            throw null;
                        }
                        C87412m.m108603p("hasMore_Field");
                        throw null;
                    }
                    C87412m.m108603p("pullType_Field");
                    throw null;
                }
                C87412m.m108603p("lastBuffer_Field");
                throw null;
            }
            C87412m.m108603p("incrementList_Field");
            throw null;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.RefreshLoadMoreCallback", e, "getArgsOnFetchDone crash: " + e.getMessage(), new Object[0]);
            return null;
        }
    }
}
