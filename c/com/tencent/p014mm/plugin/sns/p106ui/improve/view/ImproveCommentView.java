package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsSingleTextViewUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gv2.C98242p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import te3.w64;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Landroid/view/View;", "getContentView", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "j", "Lrx3/g;", "getContentTv", "()Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "contentTv", "n", "getCollapseTv", "collapseTv", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView */
public final class ImproveCommentView extends ImproveTranslateLayout {
    @Deprecated

    /* renamed from: r */
    public static int f279834r = -1;

    /* renamed from: j */
    public final C13601g f279835j = C36568h.m40985a(new C95879b(this));

    /* renamed from: n */
    public final C13601g f279836n = C36568h.m40985a(new C95878a(this));

    /* renamed from: o */
    public w64 f279837o;

    /* renamed from: p */
    public CharSequence f279838p;

    /* renamed from: q */
    public String f279839q;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$a */
    public static final class C95878a extends C87413o implements C32224a<ImproveTextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCommentView f279840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95878a(ImproveCommentView improveCommentView) {
            super(0);
            this.f279840d = improveCommentView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$collapseTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$collapseTv$2");
            ImproveTextView improveTextView = (ImproveTextView) this.f279840d.findViewById(C0966R.C0970id.obn);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$collapseTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$collapseTv$2");
            return improveTextView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$b */
    public static final class C95879b extends C87413o implements C32224a<ImproveTextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCommentView f279841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95879b(ImproveCommentView improveCommentView) {
            super(0);
            this.f279841d = improveCommentView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
            ImproveTextView improveTextView = (ImproveTextView) this.f279841d.findViewById(C0966R.C0970id.bjb);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
            return improveTextView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$c */
    public static final class C95880c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveCommentView f279842d;

        public C95880c(ImproveCommentView improveCommentView) {
            this.f279842d = improveCommentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$1");
            ImproveCommentView improveCommentView = this.f279842d;
            int i = ImproveCommentView.f279834r;
            SnsMethodCalculate.markStartTimeMs("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            improveCommentView.getClass();
            SnsMethodCalculate.markStartTimeMs("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            try {
                Intent intent = new Intent();
                w64 w64 = improveCommentView.f279837o;
                byte[] bArr = null;
                intent.putExtra("sns_text_show", w64 != null ? w64.f299707h : null);
                intent.putExtra("sns_local_id", improveCommentView.f279839q);
                w64 w642 = improveCommentView.f279837o;
                if (w642 != null) {
                    bArr = w642.toByteArray();
                }
                intent.putExtra("sns_comment_buf", bArr);
                intent.putExtra("sns_content_source", 2);
                intent.setClass(improveCommentView.getContext(), SnsSingleTextViewUI.class);
                Log.m105924i("MicroMsg.Improve.CommentView", "jumpToCommentDetailUI:" + improveCommentView.f279839q);
                Context context = improveCommentView.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Improve.CommentView", e, "commentCollapse click exception.", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            SnsMethodCalculate.markEndTimeMs("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$d */
    public static final class C95881d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImproveCommentView f279843d;

        public C95881d(ImproveCommentView improveCommentView) {
            this.f279843d = improveCommentView;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
            ImproveCommentView.m122750k(this.f279843d);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
        }
    }

    public ImproveCommentView(Context context) {
        super(context);
    }

    private final ImproveTextView getCollapseTv() {
        SnsMethodCalculate.markStartTimeMs("getCollapseTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        Object value = this.f279836n.getValue();
        C87412m.m108593f(value, "<get-collapseTv>(...)");
        ImproveTextView improveTextView = (ImproveTextView) value;
        SnsMethodCalculate.markEndTimeMs("getCollapseTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return improveTextView;
    }

    private final ImproveTextView getContentTv() {
        SnsMethodCalculate.markStartTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        Object value = this.f279835j.getValue();
        C87412m.m108593f(value, "<get-contentTv>(...)");
        ImproveTextView improveTextView = (ImproveTextView) value;
        SnsMethodCalculate.markEndTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return improveTextView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m122750k(com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveCommentView r14) {
        /*
            java.lang.String r0 = "access$loadFoldContent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r14.getClass()
            java.lang.String r2 = "loadFoldContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r3 = r14.getCollapseTv()
            int r3 = r3.getMeasuredWidth()
            android.content.Context r4 = r14.getContext()
            r5 = 2131166721(0x7f070601, float:1.7947695E38)
            int r4 = kg3.C76577a.m92157h(r4, r5)
            int r9 = r3 + r4
            ju2.l r3 = ju2.C99053l.f290358a
            java.lang.String r4 = r14.f279839q
            te3.w64 r5 = r14.f279837o
            if (r5 == 0) goto L_0x0034
            int r5 = r5.f299709j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            java.lang.String r6 = "generateCacheKeyAboutFoldCommentContent"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r11)
            java.lang.String r12 = ""
            if (r4 == 0) goto L_0x005a
            if (r5 == 0) goto L_0x005a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r4 = 43
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            goto L_0x005e
        L_0x005a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            r4 = r12
        L_0x005e:
            java.lang.CharSequence r6 = r14.f279838p
            gy3.C87412m.m108591d(r6)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r7 = r14.getContentTv()
            int r8 = f279834r
            java.lang.String r13 = "getFoldCommentStringWithCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r11)
            java.lang.String r5 = "cacheKeyString"
            gy3.C87412m.m108594g(r4, r5)
            java.lang.String r5 = "tv"
            gy3.C87412m.m108594g(r7, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0089
            r10 = 2
            r5 = r3
            java.lang.CharSequence r3 = r5.mo138404b(r6, r7, r8, r9, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r11)
            goto L_0x00b7
        L_0x0089:
            java.util.Map r5 = r3.mo138403a()
            java.lang.Object r5 = r5.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r5)
            if (r10 == 0) goto L_0x009f
            r10 = 2
            r5 = r3
            java.lang.CharSequence r5 = r5.mo138404b(r6, r7, r8, r9, r10)
        L_0x009f:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r5)
            if (r6 != 0) goto L_0x00af
            java.util.Map r3 = r3.mo138403a()
            gy3.C87412m.m108591d(r5)
            r3.put(r4, r5)
        L_0x00af:
            if (r5 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r12 = r5
        L_0x00b3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r11)
            r3 = r12
        L_0x00b7:
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r5 = r14.getContentTv()
            r5.setText(r3)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r14 = r14.getContentTv()
            java.lang.String r5 = "..."
            r14.append(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "loadFoldContent cacheKey:"
            r14.append(r5)
            r14.append(r4)
            java.lang.String r4 = ", content:"
            r14.append(r4)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            java.lang.String r3 = "MicroMsg.Improve.CommentView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveCommentView.m122750k(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView):void");
    }

    /* renamed from: b */
    public void mo67331b(C94965w1.C94967b bVar, int i, String str, String str2, boolean z) {
        String str3;
        SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        CharSequence charSequence = this.f279838p;
        if (charSequence == null || (str3 = (String) C112550d0.m153785U(charSequence, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null).get(0)) == null) {
            str3 = "";
        }
        super.mo67331b(bVar, i, str3 + ": " + str, str2, z);
        SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public View getContentView() {
        SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_5, this, false);
        C87412m.m108593f(inflate, "getInflater(context)\n   …nt_view_x2c, this, false)");
        SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return inflate;
    }

    /* renamed from: l */
    public final void mo133348l() {
        SnsMethodCalculate.markStartTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        w64 w64 = this.f279837o;
        if (w64 == null) {
            SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            return;
        }
        C87412m.m108591d(w64);
        if (C98242p.m126942d(w64.f299716t, 16)) {
            getCollapseTv().setVisibility(0);
            getCollapseTv().setOnClickListener(new C95880c(this));
            getContentTv().setMaxLines(2);
            if (f279834r > 0) {
                post(new C95881d(this));
            } else {
                mo133349m();
            }
        } else {
            getCollapseTv().setVisibility(8);
            getContentTv().setMaxLines(Integer.MAX_VALUE);
            mo133349m();
        }
        SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    /* renamed from: m */
    public final void mo133349m() {
        SnsMethodCalculate.markStartTimeMs("loadNormalContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        getContentTv().setText(this.f279838p);
        Log.m105918d("MicroMsg.Improve.CommentView", "loadNormalContent content:" + this.f279838p);
        SnsMethodCalculate.markEndTimeMs("loadNormalContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        super.onLayout(z, i, i2, i3, i4);
        if (z && f279834r != getContentTv().getWidth()) {
            f279834r = getContentTv().getWidth();
            mo133348l();
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public ImproveCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImproveCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
