package bh3;

import android.graphics.Bitmap;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: bh3.f */
public final class C28320f {

    /* renamed from: a */
    public static final C28320f f77928a = new C28320f();

    /* renamed from: b */
    public static final HashMap<String, List<Pair<String, String>>> f77929b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, List<Pair<String, String>>> f77930c = new HashMap<>();

    /* renamed from: bh3.f$a */
    public static final class C28321a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f77931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28321a(Object obj) {
            super(0);
            this.f77931d = obj;
        }

        public Object invoke() {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.lzq, new Object[]{this.f77931d}), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh3.f$b */
    public static final class C28322b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f77932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28322b(Object obj) {
            super(0);
            this.f77932d = obj;
        }

        public Object invoke() {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.lzq, new Object[]{this.f77932d}), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55918a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, java.lang.Object[] r12, java.lang.Boolean r13) {
        /*
            r8 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[invokeMethod] enter, methodName:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", caller:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", args:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExportFileHooker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.lang.Class<com.tencent.mm.platformtools.ExportFileUtil> r1 = com.tencent.p014mm.platformtools.ExportFileUtil.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[invokeMethod]  clazz:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", inputClassName:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            int r9 = r10.hashCode()
            r3 = -924832793(0xffffffffc8e02be7, float:-459103.22)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r9 == r3) goto L_0x0084
            r3 = -806469907(0xffffffffcfee3eed, float:-7.9942026E9)
            if (r9 == r3) goto L_0x0072
            r3 = 1159024839(0x451550c7, float:2389.0486)
            if (r9 == r3) goto L_0x005e
            goto L_0x008c
        L_0x005e:
            java.lang.String r9 = "exportImageImpl"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0067
            goto L_0x008c
        L_0x0067:
            java.lang.Class[] r9 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r7] = r3
            r9[r6] = r0
            r9[r5] = r0
            goto L_0x0099
        L_0x0072:
            java.lang.String r9 = "exportToPublicDownloadDirImpl"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x007b
            goto L_0x008c
        L_0x007b:
            java.lang.Class[] r9 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r7] = r3
            r9[r6] = r0
            goto L_0x0099
        L_0x0084:
            java.lang.String r9 = "exportVideoImpl"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x008f
        L_0x008c:
            java.lang.Class[] r9 = new java.lang.Class[r7]
            goto L_0x0099
        L_0x008f:
            java.lang.Class[] r9 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r7] = r3
            r9[r6] = r0
            r9[r5] = r0
        L_0x0099:
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            java.lang.Class[] r9 = (java.lang.Class[]) r9
            java.lang.reflect.Method r9 = r1.getDeclaredMethod(r10, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[invokeMethod]  method:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            if (r9 != 0) goto L_0x00bb
            goto L_0x00be
        L_0x00bb:
            r9.setAccessible(r6)
        L_0x00be:
            if (r9 == 0) goto L_0x00ca
            int r10 = r12.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r12, r10)
            java.lang.Object r9 = r9.invoke(r11, r10)
            goto L_0x00cb
        L_0x00ca:
            r9 = 0
        L_0x00cb:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r13, r10)
            if (r10 == 0) goto L_0x00db
            bh3.f$a r10 = new bh3.f$a
            r10.<init>(r9)
            o40.C61926c.m72668M(r10)
        L_0x00db:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C28320f.mo55918a(java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.Boolean):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo55919b(String str, String str2, Object obj, Object[] objArr, Boolean bool) {
        Class cls = Integer.TYPE;
        Method declaredMethod = BitmapUtil.class.getDeclaredMethod(str2, (Class[]) Arrays.copyOf(new Class[]{Bitmap.class, cls, cls, String.class, Boolean.TYPE}, 5));
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
        }
        Object invoke = declaredMethod != null ? declaredMethod.invoke(obj, Arrays.copyOf(objArr, objArr.length)) : null;
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            C61926c.m72668M(new C28322b(invoke));
        }
        return invoke;
    }
}
