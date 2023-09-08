package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import kotlin.Metadata;
import l31.C61212e;
import org.libpag.PAGView;
import rx3.C13604l;
import sx3.C90364q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001bJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftSendBtn;", "Landroid/widget/RelativeLayout;", "", "", "", "getReportSdkViewInfo", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "getSingleClickPagTask", "()Ljava/lang/Runnable;", "singleClickPagTask", "n", "Ljava/lang/String;", "getMCurGiftId", "()Ljava/lang/String;", "setMCurGiftId", "(Ljava/lang/String;)V", "mCurGiftId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn */
public final class FinderLiveGiftSendBtn extends RelativeLayout {

    /* renamed from: d */
    public final String f15256d;

    /* renamed from: e */
    public final long f15257e;

    /* renamed from: f */
    public final View f15258f;

    /* renamed from: g */
    public final PAGView f15259g;

    /* renamed from: h */
    public String f15260h;

    /* renamed from: i */
    public String f15261i;

    /* renamed from: j */
    public final Runnable f15262j;

    /* renamed from: n */
    public String f15263n;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn$a */
    public static final class C3195a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveGiftSendBtn f15264d;

        public C3195a(FinderLiveGiftSendBtn finderLiveGiftSendBtn) {
            this.f15264d = finderLiveGiftSendBtn;
        }

        public final void run() {
            this.f15264d.mo3286c();
            FinderLiveGiftSendBtn finderLiveGiftSendBtn = this.f15264d;
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_gift_send_again", finderLiveGiftSendBtn.f15258f, finderLiveGiftSendBtn.getReportSdkViewInfo(), 25561);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftSendBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f15256d = "FinderLiveGiftSendBtn";
        this.f15257e = 500;
        this.f15260h = "assets://finder_live_gift_continue_click_short.pag";
        this.f15261i = "assets://finder_live_gift_single_click_short.pag";
        View.inflate(context, C0966R.C0971layout.agy, this);
        View findViewById = findViewById(C0966R.C0970id.dkt);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder…reen_gift_send_container)");
        this.f15258f = findViewById;
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.dkr);
        C87412m.m108593f(findViewById2, "fullScreenSendAgainConta…reen_gift_send_again_pag)");
        this.f15259g = (PAGView) findViewById2;
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(findViewById, "finder_live_room_gift_again");
        this.f15262j = new C3195a(this);
    }

    /* access modifiers changed from: private */
    public final Map<String, Object> getReportSdkViewInfo() {
        return C90364q0.m113148g(new C13604l("live_gift_id", this.f15263n));
    }

    /* renamed from: b */
    public final void mo3285b(boolean z) {
        String str = this.f15256d;
        Log.m105924i(str, "showContinueClickSendAgaim longClick:" + z);
        if (!C87412m.m108589b(this.f15259g.getPath(), this.f15260h)) {
            if (this.f15259g.isPlaying()) {
                this.f15259g.stop();
            }
            String str2 = this.f15260h;
            if (!C87412m.m108589b(this.f15259g.getPath(), str2)) {
                this.f15259g.setPath(str2);
            }
            this.f15259g.setRepeatCount(1);
        }
        this.f15259g.setProgress(0.0d);
        this.f15259g.play();
        if (z) {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_gift_send_again", this.f15258f, getReportSdkViewInfo(), 25561);
        }
    }

    /* renamed from: c */
    public final void mo3286c() {
        Log.m105924i(this.f15256d, "showSingleClickSendAgian");
        if (!C87412m.m108589b(this.f15259g.getPath(), this.f15261i)) {
            if (this.f15259g.isPlaying()) {
                this.f15259g.stop();
            }
            String str = this.f15261i;
            if (!C87412m.m108589b(this.f15259g.getPath(), str)) {
                this.f15259g.setPath(str);
            }
            this.f15259g.setRepeatCount(-1);
            this.f15259g.setProgress(0.0d);
        }
        if (!this.f15259g.isPlaying()) {
            this.f15259g.play();
        }
    }

    public final String getMCurGiftId() {
        return this.f15263n;
    }

    public final Runnable getSingleClickPagTask() {
        return this.f15262j;
    }

    public final void setMCurGiftId(String str) {
        this.f15263n = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftSendBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
