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
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p434ig.C98672d;
import p434ig.C98680m;
import p861pg.C62279a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;

/* renamed from: rg.j */
public final class C63422j extends UIComponent {

    /* renamed from: d */
    public final C13601g f179908d;

    /* renamed from: rg.j$a */
    public /* synthetic */ class C63423a extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63423a(Object obj) {
            super(1, obj, C63422j.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C63422j) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.j$b */
    public /* synthetic */ class C63424b extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63424b(Object obj) {
            super(1, obj, C63422j.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C63422j) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.j$c */
    public static final class C63425c extends C87413o implements C32224a<UIStateCenter<C63426k>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f179909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63425c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f179909d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C63426k(), this.f179909d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63422j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f179908d = C36568h.m40985a(new C63425c(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        ((UIStateCenter) ((C36570n) this.f179908d).getValue()).process((C0125s) getActivity(), new C63423a(this));
        ((UIStateCenter) ((C36570n) this.f179908d).getValue()).observe((C0125s) getActivity(), new C63424b(this));
    }

    public void onCreateAfter(Bundle bundle) {
        Intent intent = getActivity().getIntent();
        if (intent.getIntExtra("album_enter_from_scene", -1) == 6) {
            long longExtra = intent.getLongExtra("message_id", 0);
            String stringExtra = intent.getStringExtra("record_xml");
            String stringExtra2 = intent.getStringExtra("message_user_name");
            intent.getStringExtra("record_data_id");
            if (stringExtra != null) {
                C98680m mVar = new C98680m();
                mVar.mo141099d(stringExtra);
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(longExtra);
                AppCompatActivity activity = getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(AlbumPreviewUIC.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…umPreviewUIC::class.java)");
                UIStateCenter<C63426k> k3 = ((AlbumPreviewUIC) a).mo76239k3();
                List<C98672d> list = mVar.f289375f;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                int i = 0;
                for (T next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C98672d dVar = (C98672d) next;
                        String K = dVar.mo55264K();
                        List<C98672d> list2 = mVar.f289375f;
                        C98680m mVar2 = mVar;
                        C62279a aVar = r5;
                        C62279a aVar2 = new C62279a(K, i, dVar, b002, 5, list2);
                        arrayList.add(aVar);
                        mVar = mVar2;
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                k3.dispatch(new C63413d(b002, arrayList));
            }
            Log.m105924i("MicroMsg.AlbumPreviewRecordDataUIC", "show albumPreviewUI, msgId: " + longExtra + ", talker: " + stringExtra2);
        }
    }
}
