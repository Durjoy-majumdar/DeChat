package rr2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.vfs.C86013q1;
import d03.C58010a;
import ft3.C116895f;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rr2.g */
public final class C101452g extends C99417a {

    /* renamed from: f */
    public final C13601g f297118f = C36568h.m40985a(new C101454b(this));

    /* renamed from: g */
    public final C13601g f297119g = C36568h.m40985a(new C101453a(this));

    /* renamed from: h */
    public RecordConfigProvider f297120h;

    /* renamed from: rr2.g$a */
    public static final class C101453a extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C101452g f297121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101453a(C101452g gVar) {
            super(0);
            this.f297121d = gVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$context$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$context$2");
            C101452g gVar = this.f297121d;
            SnsMethodCalculate.markStartTimeMs("access$getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            MMTPEffectVideoLayout y = gVar.mo140954y();
            SnsMethodCalculate.markEndTimeMs("access$getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            Context context = y.getContext();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$context$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$context$2");
            return context;
        }
    }

    /* renamed from: rr2.g$b */
    public static final class C101454b extends C87413o implements C32224a<MMTPEffectVideoLayout> {

        /* renamed from: d */
        public final /* synthetic */ C101452g f297122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101454b(C101452g gVar) {
            super(0);
            this.f297122d = gVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$effectView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$effectView$2");
            C101452g gVar = this.f297122d;
            SnsMethodCalculate.markStartTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            View w = gVar.mo138857w(C0966R.C0970id.bvc);
            SnsMethodCalculate.markEndTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            MMTPEffectVideoLayout mMTPEffectVideoLayout = (MMTPEffectVideoLayout) w;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$effectView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$effectView$2");
            return mMTPEffectVideoLayout;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101452g(C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C60695a player = mo140954y().getPlayer();
        if (player != null) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C60695a player = mo140954y().getPlayer();
        if (player != null) {
            player.mo85619m();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    public void release() {
        SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C60695a player = mo140954y().getPlayer();
        if (player != null) {
            player.stopAsync();
        }
        C60695a player2 = mo140954y().getPlayer();
        if (player2 != null) {
            player2.recycle();
        }
        mo140954y().mo81101g();
        SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C58010a aVar;
        SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f297120h = recordConfigProvider;
        String str = C86013q1.m106450k(recordConfigProvider.f272900A) ? recordConfigProvider.f272900A : recordConfigProvider.f272903D;
        C87412m.m108593f(str, "mediaPath");
        SnsMethodCalculate.markStartTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C116895f.m164891c("MicroMsg.SnsCoverEffectPreviewPlugin", "prepareAndPlayVideo path:" + str);
        mo140954y().mo81100f();
        SnsMethodCalculate.markStartTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        C94554a c = C94555d.m119567c(str, true);
        if (c == null) {
            aVar = new C58010a("", "", str, 0, 0);
            SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        } else {
            C58010a aVar2 = new C58010a("", str, "", c.f273445c, c.f273446d);
            aVar2.f165933e = true;
            aVar2.f165939k = c.f273456n;
            SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            aVar = aVar2;
        }
        mo140954y().setMediaInfo(aVar);
        C60695a player = mo140954y().getPlayer();
        if (player != null) {
            player.mo85614i(true);
        }
        C60695a player2 = mo140954y().getPlayer();
        if (player2 != null) {
            player2.setLoop(true);
        }
        C60695a player3 = mo140954y().getPlayer();
        if (player3 != null) {
            player3.mo85619m();
        }
        mo140954y().getEffectRenderReport().f334062b = 1;
        int i = aVar.f165950v;
        if (i > 0 || aVar.f165951w > 0) {
            int i2 = aVar.f165939k;
            if (((i2 == 90 || i2 == 270) ? (((float) i) * 1.0f) / ((float) aVar.f165951w) : (((float) aVar.f165951w) * 1.0f) / ((float) i)) < 1.7777778f) {
                mo140954y().getEffectManager().mo154924d();
            }
            mo140954y().setOnFirstFrameAvailable(new C101455h(str, this));
            SnsMethodCalculate.markEndTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        } else {
            SnsMethodCalculate.markEndTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        }
        SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    /* renamed from: x */
    public final Context mo140953x() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        Context context = (Context) ((C36570n) this.f297119g).getValue();
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        return context;
    }

    /* renamed from: y */
    public final MMTPEffectVideoLayout mo140954y() {
        SnsMethodCalculate.markStartTimeMs("getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = (MMTPEffectVideoLayout) ((C36570n) this.f297118f).getValue();
        SnsMethodCalculate.markEndTimeMs("getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        return mMTPEffectVideoLayout;
    }
}
