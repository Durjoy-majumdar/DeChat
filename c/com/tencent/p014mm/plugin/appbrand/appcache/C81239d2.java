package com.tencent.p014mm.plugin.appbrand.appcache;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import android.widget.Toast;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import s24.C90124b;
import sx3.C110821n;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.appcache.TrimAndPrintWxaPkgs$execute$1$1", mo125469f = "TrimAndPrintWxaPkgs.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.d2 */
public final class C81239d2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f238637d;

    /* renamed from: e */
    public final /* synthetic */ boolean f238638e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.appcache.TrimAndPrintWxaPkgs$execute$1$1$2", mo125469f = "TrimAndPrintWxaPkgs.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d2$a */
    public static final class C1515a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
        public C1515a(C15601d<? super C1515a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C1515a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C1515a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Toast.makeText(MMApplicationContext.getContext(), "TrimAndPrintWxaPkgs Done!", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81239d2(boolean z, C15601d<? super C81239d2> dVar) {
        super(2, dVar);
        this.f238638e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C81239d2(this.f238638e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C81239d2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C86009m1[] m1VarArr;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f238637d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f238638e) {
                C81244g0.f238642a.run();
            }
            String c = C81355t2.m99777c();
            C81161g2.requireAccountInitializedOnDemand();
            C81258h3 h3Var = C81161g2.f238471g;
            LinkedList<String> linkedList = new LinkedList<>();
            LinkedList<String> linkedList2 = new LinkedList<>();
            ArrayList arrayList = new ArrayList();
            C81355t2.m99779e(C81355t2.m99776b(), arrayList);
            C86009m1[] m1VarArr2 = (C86009m1[]) arrayList.toArray(new C86009m1[0]);
            C86009m1[] u = new C86009m1(c).mo119984u();
            if (m1VarArr2 != null) {
                if (u == null) {
                    u = new C86009m1[0];
                }
                m1VarArr = (C86009m1[]) C110821n.m150972s(m1VarArr2, u);
            } else {
                m1VarArr = null;
            }
            if (m1VarArr == null) {
                m1VarArr = new C86009m1[0];
            }
            for (C86009m1 i2 : m1VarArr) {
                String i3 = i2.mo119971i();
                C87412m.m108593f(i3, "it.absolutePath");
                C29315z2 n = h3Var.mo113530n(i3);
                if (n == null) {
                    linkedList2.add(C110823p.m150987M(new String[]{i3, String.valueOf(C86013q1.m106451l(i3))}, APLogFileUtil.SEPARATOR_LOG, "| ", " |", 0, (CharSequence) null, (C32226l) null, 56, (Object) null));
                } else {
                    linkedList.add(C110823p.m150987M(new String[]{n.field_appId, String.valueOf(n.field_debugType), String.valueOf(n.field_version), i3, String.valueOf(C86013q1.m106451l(i3))}, APLogFileUtil.SEPARATOR_LOG, "| ", " |", 0, (CharSequence) null, (C32226l) null, 56, (Object) null));
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("###TRACKED");
            sb.append('(');
            sb.append(String.valueOf(linkedList.size()));
            sb.append(')');
            sb.append(10);
            sb.append("| appId | versionType | appVersion | path | size |");
            sb.append(10);
            sb.append("| ----- | ----------- | ---------- | ---- | ---- |");
            sb.append(10);
            for (String append : linkedList) {
                sb.append(append);
                sb.append(10);
            }
            sb.append(10);
            sb.append("###UNTRACKED");
            sb.append('(');
            sb.append(String.valueOf(linkedList2.size()));
            sb.append(')');
            sb.append(10);
            sb.append("| path | size |");
            sb.append(10);
            sb.append("| ---- | ---- |");
            sb.append(10);
            for (String append2 : linkedList2) {
                sb.append(append2);
                sb.append(10);
            }
            File externalCacheDir = MMApplicationContext.getContext().getExternalCacheDir();
            C87412m.m108591d(externalCacheDir);
            String a = C90124b.m112766a(externalCacheDir.getAbsolutePath(), "dump_wxapkgs.md");
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "stringBuilder.toString()");
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            byte[] bytes = sb4.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            C86013q1.m106438T(a, bytes, 0, bytes.length);
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C1515a aVar2 = new C1515a((C15601d<? super C1515a>) null);
            this.f238637d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                C81241e2.f238639a = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C81241e2.f238639a = null;
        return C13598b0.f38549a;
    }
}
