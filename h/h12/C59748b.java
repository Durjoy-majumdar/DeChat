package h12;

import a70.C112760b;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import n20.C100033c;
import n20.C100034d;
import n20.C100035h;
import n20.C100038k;
import n20.C61603e;
import n20.C61604f;
import n20.C61605g;
import n20.C61609o;
import n20.C61611s;
import p823sg.C90193h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

@C86522b
/* renamed from: h12.b */
public final class C59748b extends C86301e implements C61611s {

    /* renamed from: e */
    public static final C13601g<HashMap<String, List<WeakReference<ImageView>>>> f170640e = C36568h.m40985a(C32653b.f86662d);

    /* renamed from: d */
    public final C13601g f170641d = C36568h.m40985a(C32652a.f86661d);

    /* renamed from: h12.b$a */
    public static final class C32652a extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C32652a f86661d = new C32652a();

        public C32652a() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_CommonImageLoader";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: h12.b$b */
    public static final class C32653b extends C87413o implements C32224a<HashMap<String, List<WeakReference<ImageView>>>> {

        /* renamed from: d */
        public static final C32653b f86662d = new C32653b();

        public C32653b() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: h12.b$c */
    public static final class C32654c {
        public C32654c(C8480h hVar) {
        }
    }

    static {
        new C32654c((C8480h) null);
    }

    /* renamed from: PU */
    public void mo84732PU(ImageView imageView, String str, C61605g gVar) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(gVar, "bitmapOptions");
        C61603e eVar = new C61603e(str);
        PipelineState ng = mo84733ng(mo84736z9(eVar, gVar), gVar, imageView, "");
        ng.put("Common_TempFolder", xn0());
        ng.put("Common_HttpParams", eVar);
        ng.put("Common_ImageViewRefMap", (HashMap) ((C36570n) f170640e).getValue());
        mo84734xO().mo86542a(ng);
    }

    /* renamed from: ng */
    public PipelineState mo84733ng(String str, C61605g gVar, ImageView imageView, String str2) {
        C87412m.m108594g(str, "imageKey");
        C87412m.m108594g(gVar, "bitmapOptions");
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str2, "targetPath");
        PipelineState pipelineState = new PipelineState();
        pipelineState.put("Common_ImageKey", str);
        pipelineState.put("Common_TempFolder", xn0());
        pipelineState.put("Common_ImageViewRef", new WeakReference(imageView));
        pipelineState.put("Common_TargetPath", str2);
        pipelineState.put("Common_BitmapOptions", gVar);
        pipelineState.put("Common_ImageViewRefMap", (HashMap) ((C36570n) f170640e).getValue());
        return pipelineState;
    }

    /* renamed from: xO */
    public C61604f mo84734xO() {
        return new C61604f(C64197v.m75539h(C100035h.class, C100038k.class, C100033c.class, C61609o.class, C100034d.class));
    }

    public C86009m1 xn0() {
        C86009m1 m1Var = (C86009m1) ((C36570n) this.f170641d).getValue();
        C87412m.m108593f(m1Var, "CommomTempFolder");
        return m1Var;
    }

    /* renamed from: z9 */
    public String mo84736z9(C61603e eVar, C61605g gVar) {
        C87412m.m108594g(eVar, "httpParams");
        C87412m.m108594g(gVar, "bitmapOptions");
        String str = eVar.f175190a;
        C87412m.m108594g(str, "keyPath");
        String str2 = gVar.f175193b + '_' + gVar.f175192a + '_' + 0.0f + '_' + gVar.f175194c + '_' + str;
        try {
            Charset forName = Charset.forName("utf8");
            C87412m.m108593f(forName, "forName(\"utf8\")");
            byte[] bytes = str2.getBytes(forName);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String f = C90193h.m112878f(bytes);
            C87412m.m108593f(f, "{\n            MD5.getMes…rName(\"utf8\")))\n        }");
            return f;
        } catch (Exception unused) {
            Charset defaultCharset = Charset.defaultCharset();
            C87412m.m108593f(defaultCharset, "defaultCharset()");
            byte[] bytes2 = str2.getBytes(defaultCharset);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            String f2 = C90193h.m112878f(bytes2);
            C87412m.m108593f(f2, "{\n            MD5.getMes…aultCharset()))\n        }");
            return f2;
        }
    }
}
