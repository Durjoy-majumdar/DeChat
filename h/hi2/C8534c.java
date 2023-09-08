package hi2;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: hi2.c */
public final class C8534c {

    /* renamed from: a */
    public final C13601g f27589a = C36568h.m40985a(new C8535a(this));

    /* renamed from: b */
    public boolean f27590b;

    /* renamed from: hi2.c$a */
    public static final class C8535a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public final /* synthetic */ C8534c f27591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8535a(C8534c cVar) {
            super(0);
            this.f27591d = cVar;
        }

        public Object invoke() {
            this.f27591d.getClass();
            String str = "editor_audio_mmkv";
            if (C86709a0.m107523b().mo121115m() && C86709a0.m107523b().mo121115m()) {
                str = C86709a0.m107523b().mo121111i() + '#' + str;
            }
            return MultiProcessMMKV.getMMKV(str);
        }
    }
}
