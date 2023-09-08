package p226rg;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C75875l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p861pg.C62279a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;

/* renamed from: rg.a */
public final class C63404a extends UIComponent {

    /* renamed from: d */
    public final C13601g f179889d;

    /* renamed from: rg.a$a */
    public /* synthetic */ class C63405a extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63405a(Object obj) {
            super(1, obj, C63404a.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C63404a) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.a$b */
    public /* synthetic */ class C63406b extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63406b(Object obj) {
            super(1, obj, C63404a.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C63426k kVar = (C63426k) obj;
            C87412m.m108594g(kVar, "p0");
            ((C63404a) this.receiver).getClass();
            IStateAction action = kVar.getAction();
            if (action != null && (action instanceof C63431q)) {
                C63431q qVar = (C63431q) action;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.a$c */
    public static final class C63407c extends C87413o implements C32224a<UIStateCenter<C63426k>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f179890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63407c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f179890d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C63426k(), this.f179890d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63404a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f179889d = C36568h.m40985a(new C63407c(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        ((UIStateCenter) ((C36570n) this.f179889d).getValue()).process((C0125s) getActivity(), new C63405a(this));
        ((UIStateCenter) ((C36570n) this.f179889d).getValue()).observe((C0125s) getActivity(), new C63406b(this));
    }

    public void onCreateAfter(Bundle bundle) {
        Class cls = C75700k0.class;
        Intent intent = getActivity().getIntent();
        String stringExtra = intent.getStringExtra("img_gallery_talker");
        String stringExtra2 = intent.getStringExtra("img_gallery_chatroom_name");
        long longExtra = intent.getLongExtra("img_gallery_msg_id", 0);
        long longExtra2 = intent.getLongExtra("img_gallery_msg_svr_id", 0);
        boolean z = true;
        if (intent.getIntExtra("album_enter_from_scene", -1) == 1) {
            int i = (longExtra > 0 ? 1 : (longExtra == 0 ? 0 : -1));
            if (i > 0 || longExtra2 != 0) {
                if (i == 0) {
                    C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                    if (stringExtra2 != null) {
                        if (stringExtra2.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            stringExtra = stringExtra2;
                        }
                    }
                    longExtra = ((C72972g4) LE).h30(stringExtra, longExtra2).getMsgId();
                }
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(longExtra);
                C98671a aVar = new C98671a();
                String content = b002.getContent();
                C87412m.m108593f(content, "currentMsg.content");
                aVar.mo141099d(content);
                C98674g gVar = new C98674g();
                gVar.mo141099d(aVar.f289309p);
                AppCompatActivity activity = getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(AlbumPreviewUIC.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…umPreviewUIC::class.java)");
                UIStateCenter<C63426k> k3 = ((AlbumPreviewUIC) a).mo76239k3();
                List<C98672d> list = gVar.f289364h;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                int i2 = 0;
                for (T next : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C98672d dVar = (C98672d) next;
                        arrayList.add(new C62279a(dVar.mo55264K(), i2, dVar, b002, 1, gVar.f289364h));
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                k3.dispatch(new C63413d(b002, arrayList));
                return;
            }
            Log.m105920e("MicroMsg.AlbumPreviewDataUIC", " initView, msgId is invalid, msgId = " + longExtra + ", msgSvrId = " + longExtra2 + ", stack = " + Util.getStack());
            getActivity().finish();
        }
    }
}
