package com.tencent.matrix.lifecycle;

import android.app.Application;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import p723vf.C90779e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;
import z04.C91602g0;

/* renamed from: com.tencent.matrix.lifecycle.l */
public final class C80415l {

    /* renamed from: a */
    public static Application f235357a;

    /* renamed from: b */
    public static final C13601g f235358b = C36568h.m40985a(C80416a.f235360d);

    /* renamed from: c */
    public static final C80415l f235359c = new C80415l();

    /* renamed from: com.tencent.matrix.lifecycle.l$a */
    public static final class C80416a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C80416a f235360d = new C80416a();

        public C80416a() {
            super(0);
        }

        public Object invoke() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Matrix.lifecycle.Logger_");
            Object[] objArr = new Object[1];
            Application application = C80415l.f235357a;
            C87412m.m108591d(application);
            if (C90779e.m113847b(application)) {
                str = "Main";
            } else {
                Application application2 = C80415l.f235357a;
                C87412m.m108591d(application2);
                String a = C90779e.m113846a(application2);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(application!!)");
                Object[] array = C112550d0.m153785U(a, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    str = strArr.length > 1 ? C91602g0.m114948p0(strArr[1], 10) : "unknown";
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            objArr[0] = str;
            String format = String.format("%-10.10s", Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "java.lang.String.format(format, *args)");
            sb.append(format);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final String mo111904a() {
        return (String) ((C36570n) f235358b).getValue();
    }
}
