package com.tencent.p014mm.mj_template.album_template.multi_template;

import android.content.Intent;
import android.os.Bundle;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import f72.C97842b;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import java.util.Set;
import kotlin.Metadata;
import la0.C61242a;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import vo3.C90852c;
import z90.C66739c;
import z90.C66758h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/album_template/multi_template/MaasAlbumMultiTemplatePreviewUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI */
public final class MaasAlbumMultiTemplatePreviewUI extends MMComposeActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f157453f = 0;

    /* renamed from: d */
    public final C13601g f157454d = C36568h.m40985a(C55277b.f157457d);

    /* renamed from: e */
    public final C13601g f157455e = C36568h.m40985a(new C55276a(this));

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI$a */
    public static final class C55276a extends C87413o implements C32224a<MaasPageFinderReporter> {

        /* renamed from: d */
        public final /* synthetic */ MaasAlbumMultiTemplatePreviewUI f157456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55276a(MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI) {
            super(0);
            this.f157456d = maasAlbumMultiTemplatePreviewUI;
        }

        public Object invoke() {
            Intent intent = this.f157456d.getIntent();
            C87412m.m108593f(intent, "intent");
            return new MaasPageFinderReporter((String) ((C36570n) this.f157456d.f157454d).getValue(), 132, "recommend_feed_template", intent);
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI$b */
    public static final class C55277b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C55277b f157457d = new C55277b();

        public C55277b() {
            super(0);
        }

        public Object invoke() {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            return Wb == null ? "" : Wb;
        }
    }

    /* renamed from: H7 */
    public final MaasPageFinderReporter mo76581H7() {
        return (MaasPageFinderReporter) ((C36570n) this.f157455e).getValue();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6324bt;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66739c.class, C0324s.m265a(C24560g0.m30725a(C61242a.class)));
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        getLifecycle().addObserver(mo76581H7());
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        C97842b.f286991a = true;
        C85864g1.m106128c(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
        C66739c cVar = (C66739c) C39818r.f106831a.mo62444c(this).mo62449e(C66739c.class);
        if (cVar != null) {
            cVar.f191788y.f157678n = new C66758h(this);
        }
    }
}
