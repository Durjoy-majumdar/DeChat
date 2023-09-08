package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import pr2.C100844c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverDefaultView;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lpr2/c;", "info", "Lrx3/b0;", "loadCover", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "", "TAG", "Ljava/lang/String;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "changeCoverTxt$delegate", "Lrx3/g;", "getChangeCoverTxt", "()Landroid/widget/TextView;", "changeCoverTxt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView */
public class SnsCoverDefaultView extends AbsSnsBackPreview {
    private final String TAG = "MicroMsg.SnsCoverDefaultView";
    private final C13601g changeCoverTxt$delegate = C36568h.m40985a(new C57348a(this));

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$a */
    public static final class C57348a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsCoverDefaultView f164321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57348a(SnsCoverDefaultView snsCoverDefaultView) {
            super(0);
            this.f164321d = snsCoverDefaultView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
            TextView textView = (TextView) this.f164321d.findViewById(C0966R.C0970id.jsj);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$changeCoverTxt$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$b */
    public static final class C57349b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsCoverDefaultView f164322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57349b(SnsCoverDefaultView snsCoverDefaultView) {
            super(0);
            this.f164322d = snsCoverDefaultView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$loadCover$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$loadCover$1");
            SnsCoverDefaultView.access$getChangeCoverTxt(this.f164322d).setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$loadCover$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView$loadCover$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverDefaultView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public static final /* synthetic */ TextView access$getChangeCoverTxt(SnsCoverDefaultView snsCoverDefaultView) {
        SnsMethodCalculate.markStartTimeMs("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        TextView changeCoverTxt = snsCoverDefaultView.getChangeCoverTxt();
        SnsMethodCalculate.markEndTimeMs("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return changeCoverTxt;
    }

    private final TextView getChangeCoverTxt() {
        SnsMethodCalculate.markStartTimeMs("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        TextView textView = (TextView) this.changeCoverTxt$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return textView;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return C0966R.C0971layout.c2n;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return 0;
    }

    public void loadCover(C100844c cVar) {
        SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        String str = null;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        if (cVar != null) {
            str = cVar.getUserName();
        }
        if (!C87412m.m108589b(e, str)) {
            C61926c.m72668M(new C57349b(this));
        }
        SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        Log.m105924i(this.TAG, "[onPreClose]");
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        Log.m105924i(this.TAG, "[onPreOpen]");
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }
}
