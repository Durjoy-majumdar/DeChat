package sb2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvAlbumPreviewUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import qb2.C62598a;
import qb2.C62599b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64525lh3;

/* renamed from: sb2.a */
public final class C63738a extends UIComponent {

    /* renamed from: d */
    public final C13601g f180687d;

    /* renamed from: sb2.a$a */
    public static final class C63739a extends C87413o implements C32224a<UIStateCenter<C62598a>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63739a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180688d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C62598a(), this.f180688d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63738a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180687d = C36568h.m40985a(new C63739a(appCompatActivity));
    }

    /* renamed from: c3 */
    public final UIStateCenter<C62598a> mo88561c3() {
        return (UIStateCenter) ((C36570n) this.f180687d).getValue();
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getActivity().getIntent();
        C64525lh3 lh32 = MusicMvAlbumPreviewUI.f163015d;
        C64525lh3 lh33 = MusicMvAlbumPreviewUI.f163015d;
        if (lh33 != null) {
            mo88561c3().dispatch(new C62599b(lh33));
            MusicMvAlbumPreviewUI.f163015d = null;
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("PreviewItemObj");
        if (byteArrayExtra != null) {
            C64525lh3 lh34 = new C64525lh3();
            lh34.parseFrom(byteArrayExtra);
            mo88561c3().dispatch(new C62599b(lh34));
        }
    }
}
