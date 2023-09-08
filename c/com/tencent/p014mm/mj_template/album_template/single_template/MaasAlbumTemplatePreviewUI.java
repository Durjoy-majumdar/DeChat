package com.tencent.p014mm.mj_template.album_template.single_template;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C39623j;
import ba0.C54438d;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.api.MJTemplateSession;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateRequestParams;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f72.C97842b;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import la0.C61242a;
import nj3.C88989a;
import o31.C11345b;
import pa0.C62211a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C64186f0;
import te3.pr4;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI */
public final class MaasAlbumTemplatePreviewUI extends MMComposeActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f157458g = 0;

    /* renamed from: d */
    public final C13601g f157459d = C36568h.m40985a(new C55280c(this));

    /* renamed from: e */
    public final C13601g f157460e = C36568h.m40985a(C55279b.f157463d);

    /* renamed from: f */
    public final C13601g f157461f = C36568h.m40985a(new C55278a(this));

    /* renamed from: com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI$a */
    public static final class C55278a extends C87413o implements C32224a<MaasAlbumTemplateRequestParams> {

        /* renamed from: d */
        public final /* synthetic */ MaasAlbumTemplatePreviewUI f157462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55278a(MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI) {
            super(0);
            this.f157462d = maasAlbumTemplatePreviewUI;
        }

        public Object invoke() {
            MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (MaasAlbumTemplateRequestParams) this.f157462d.getIntent().getParcelableExtra("request_params");
            if (maasAlbumTemplateRequestParams != null) {
                return maasAlbumTemplateRequestParams;
            }
            MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI = this.f157462d;
            Log.m105920e("MicroMsg.MJAlbumTemplatePreviewUI", "do not get request params");
            maasAlbumTemplatePreviewUI.getContext().finish();
            return new MaasAlbumTemplateRequestParams(C64186f0.f181907d, new MJTemplateSession(new byte[1], (String) null, 2, (C8480h) null));
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI$b */
    public static final class C55279b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C55279b f157463d = new C55279b();

        public C55279b() {
            super(0);
        }

        public Object invoke() {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            return Wb == null ? "" : Wb;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI$c */
    public static final class C55280c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MaasAlbumTemplatePreviewUI f157464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55280c(MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI) {
            super(0);
            this.f157464d = maasAlbumTemplatePreviewUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f157464d.getIntent().getBooleanExtra("source_sns", false));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return ((Boolean) ((C36570n) this.f157459d).getValue()).booleanValue() ? C0966R.C0971layout.f6331rb : C0966R.C0971layout.f6324bt;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Class<C61242a> cls = C61242a.class;
        if (((Boolean) ((C36570n) this.f157459d).getValue()).booleanValue()) {
            return C110826x0.m151017e(C0324s.m265a(C24560g0.m30725a(cls)), C62211a.class);
        }
        return C110826x0.m151017e(C54438d.class, C0324s.m265a(C24560g0.m30725a(cls)));
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        if (!((Boolean) ((C36570n) this.f157459d).getValue()).booleanValue()) {
            C39623j lifecycle = getLifecycle();
            Intent intent = getIntent();
            C87412m.m108593f(intent, "intent");
            MaasPageFinderReporter maasPageFinderReporter = new MaasPageFinderReporter((String) ((C36570n) this.f157460e).getValue(), 133, "shoot_same_video", intent);
            String str = ((pr4) ((C36570n) ((MaasAlbumTemplateRequestParams) ((C36570n) this.f157461f).getValue()).f157475e.f157467f).getValue()).f139919d;
            C87412m.m108593f(str, "mRequestParams.mjTemplateSession.templateInfo.id");
            maasPageFinderReporter.f10375o.put("templateId", str);
            maasPageFinderReporter.mo1201a("activityid", getIntent().getLongExtra("key_topic_id", 0));
            lifecycle.addObserver(maasPageFinderReporter);
        }
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        C97842b.f286991a = true;
        C85864g1.m106128c(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.MaasAlbumTemplatePreviewUI);
    }
}
