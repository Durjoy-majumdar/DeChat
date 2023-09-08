package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.TouchableLayout;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C11184p0;
import os1.C11739f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010Z\u001a\u0004\u0018\u00010Y¢\u0006\u0004\b[\u0010\\B#\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010Z\u001a\u0004\u0018\u00010Y\u0012\u0006\u0010]\u001a\u00020\u0016¢\u0006\u0004\b[\u0010^R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00103\u001a\u00020*2\u0006\u00101\u001a\u00020*8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000206\u0018\u0001058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010E\u001a\u0004\u0018\u00010>2\b\u00101\u001a\u0004\u0018\u00010>8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010I\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00168\u0006@FX\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0018\u001a\u0004\bG\u0010\u001a\"\u0004\bH\u0010\u001cR$\u0010M\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR$\u0010P\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00168F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010\u001a\"\u0004\bO\u0010\u001cR$\u0010S\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00168F@FX\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u001a\"\u0004\bR\u0010\u001cR$\u0010V\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e8F@FX\u000e¢\u0006\f\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010\u0014¨\u0006_"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCollapsibleTextView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/neattextview/textview/view/NeatTextView;", "kotlin.jvm.PlatformType", "d", "Lrx3/g;", "getContentTextView", "()Lcom/tencent/neattextview/textview/view/NeatTextView;", "contentTextView", "Landroid/widget/TextView;", "e", "getCollapseTextView", "()Landroid/widget/TextView;", "collapseTextView", "", "f", "F", "getCollapseTextViewRight", "()F", "setCollapseTextViewRight", "(F)V", "collapseTextViewRight", "", "g", "I", "getLocalExpanText", "()I", "setLocalExpanText", "(I)V", "localExpanText", "h", "getExpanText", "setExpanText", "expanText", "Landroid/view/View;", "i", "Landroid/view/View;", "getExtraView", "()Landroid/view/View;", "setExtraView", "(Landroid/view/View;)V", "extraView", "", "j", "Z", "isTopicExpand", "()Z", "setTopicExpand", "(Z)V", "value", "n", "isCollapse", "setCollapse", "Lkotlin/Function1;", "Lrx3/b0;", "p", "Lfy3/l;", "getOnCollapse", "()Lfy3/l;", "setOnCollapse", "(Lfy3/l;)V", "onCollapse", "", "q", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "r", "getLimitLine", "setLimitLine", "limitLine", "s", "getRealContent", "setRealContent", "realContent", "getTextColor", "setTextColor", "textColor", "getExpandTextColor", "setExpandTextColor", "expandTextColor", "getTextSize", "setTextSize", "textSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView */
public final class FinderCollapsibleTextView extends RelativeLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f52536t = 0;

    /* renamed from: d */
    public final C13601g f52537d = C36568h.m40985a(new C18790d1(this));

    /* renamed from: e */
    public final C13601g f52538e = C36568h.m40985a(new C18789c1(this));

    /* renamed from: f */
    public float f52539f;

    /* renamed from: g */
    public int f52540g = C0966R.string.d0j;

    /* renamed from: h */
    public int f52541h = C0966R.string.d0j;

    /* renamed from: i */
    public View f52542i;

    /* renamed from: j */
    public boolean f52543j;

    /* renamed from: n */
    public boolean f52544n;

    /* renamed from: o */
    public float f52545o;

    /* renamed from: p */
    public C32226l<? super Boolean, C13598b0> f52546p;

    /* renamed from: q */
    public CharSequence f52547q;

    /* renamed from: r */
    public int f52548r;

    /* renamed from: s */
    public CharSequence f52549s;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$a */
    public static final class C3936a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C3936a f17641d = new C3936a();

        public C3936a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$b */
    public static final class C18771b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCollapsibleTextView f52550d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f52551e;

        public C18771b(FinderCollapsibleTextView finderCollapsibleTextView, CharSequence charSequence) {
            this.f52550d = finderCollapsibleTextView;
            this.f52551e = charSequence;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[checkIfAllRestTextTopic] start timeStamp:"
                r0.append(r1)
                long r1 = java.lang.System.currentTimeMillis()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.CollapsibleTextView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 1
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r2 = r12.f52550d     // Catch:{ Exception -> 0x0049 }
                com.tencent.neattextview.textview.view.NeatTextView r2 = r2.getContentTextView()     // Catch:{ Exception -> 0x0049 }
                yr3.a r2 = r2.getLayout()     // Catch:{ Exception -> 0x0049 }
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r3 = r12.f52550d     // Catch:{ Exception -> 0x0049 }
                int r3 = r3.getLimitLine()     // Catch:{ Exception -> 0x0049 }
                int r3 = r3 - r0
                int r2 = r2.mo109122b(r3)     // Catch:{ Exception -> 0x0049 }
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r3 = r12.f52550d     // Catch:{ Exception -> 0x0049 }
                com.tencent.neattextview.textview.view.NeatTextView r3 = r3.getContentTextView()     // Catch:{ Exception -> 0x0049 }
                yr3.a r3 = r3.getLayout()     // Catch:{ Exception -> 0x0049 }
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r4 = r12.f52550d     // Catch:{ Exception -> 0x0049 }
                int r4 = r4.getLimitLine()     // Catch:{ Exception -> 0x0049 }
                int r4 = r4 - r0
                int r3 = r3.mo109133q0(r4)     // Catch:{ Exception -> 0x0049 }
                int r2 = r2 + r3
                int r2 = r2 + 2
                goto L_0x0063
            L_0x0049:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[checkIfAllRestTextTopic] "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                r2 = -1
            L_0x0063:
                if (r2 < 0) goto L_0x0107
                java.lang.CharSequence r3 = r12.f52551e
                int r3 = r3.length()
                if (r2 <= r3) goto L_0x006f
                goto L_0x0107
            L_0x006f:
                java.lang.CharSequence r3 = r12.f52551e
                int r4 = r3.length()
                java.lang.CharSequence r3 = r3.subSequence(r2, r4)
                java.lang.CharSequence r4 = r12.f52551e
                boolean r5 = r4 instanceof android.text.SpannableString
                r6 = 0
                if (r5 == 0) goto L_0x00c6
                if (r2 <= 0) goto L_0x00c6
                r5 = 0
                r7 = 1
                r8 = 0
            L_0x0085:
                int r9 = r3.length()
                if (r5 >= r9) goto L_0x00c5
                char r9 = r3.charAt(r5)
                int r10 = r8 + 1
                r11 = 32
                if (r9 == r11) goto L_0x00c1
                r11 = 10
                if (r9 == r11) goto L_0x00c1
                r9 = r4
                android.text.SpannableString r9 = (android.text.SpannableString) r9
                int r8 = r8 + r2
                java.lang.Class<com.tencent.mm.plugin.finder.view.g5> r11 = com.tencent.p014mm.plugin.finder.view.C4059g5.class
                java.lang.Object[] r8 = r9.getSpans(r8, r8, r11)
                com.tencent.mm.plugin.finder.view.g5[] r8 = (com.tencent.p014mm.plugin.finder.view.C4059g5[]) r8
                if (r8 == 0) goto L_0x00b2
                int r9 = r8.length
                if (r9 != 0) goto L_0x00ac
                r9 = 1
                goto L_0x00ad
            L_0x00ac:
                r9 = 0
            L_0x00ad:
                if (r9 == 0) goto L_0x00b0
                goto L_0x00b2
            L_0x00b0:
                r9 = 0
                goto L_0x00b3
            L_0x00b2:
                r9 = 1
            L_0x00b3:
                if (r9 != 0) goto L_0x00c0
                r8 = r8[r6]
                java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.FinderTextClickSpan"
                gy3.C87412m.m108592e(r8, r9)
                boolean r8 = r8.f18181f
                if (r8 != 0) goto L_0x00c1
            L_0x00c0:
                r7 = 0
            L_0x00c1:
                int r5 = r5 + 1
                r8 = r10
                goto L_0x0085
            L_0x00c5:
                r6 = r7
            L_0x00c6:
                if (r6 == 0) goto L_0x00d1
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r0 = r12.f52550d
                r2 = 2131826284(0x7f11166c, float:1.9285448E38)
                r0.setExpanText(r2)
                goto L_0x00da
            L_0x00d1:
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r0 = r12.f52550d
                int r2 = r0.getLocalExpanText()
                r0.setExpanText(r2)
            L_0x00da:
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r0 = r12.f52550d
                android.widget.TextView r0 = r0.getCollapseTextView()
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r2 = r12.f52550d
                int r2 = r2.getExpanText()
                r0.setText(r2)
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r0 = r12.f52550d
                r0.setTopicExpand(r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[checkIfAllRestTextTopic] end timeStamp:"
                r0.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return
            L_0x0107:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "[checkIfAllRestTextTopic] offset:"
                r0.append(r3)
                r0.append(r2)
                java.lang.String r2 = " , length:"
                r0.append(r2)
                java.lang.CharSequence r2 = r12.f52551e
                int r2 = r2.length()
                r0.append(r2)
                java.lang.String r2 = ",text:"
                r0.append(r2)
                java.lang.CharSequence r2 = r12.f52551e
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView.C18771b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$c */
    public static final class C18772c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCollapsibleTextView f52552d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$c$a */
        public static final class C18773a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ FinderCollapsibleTextView f52553d;

            public C18773a(FinderCollapsibleTextView finderCollapsibleTextView) {
                this.f52553d = finderCollapsibleTextView;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i == 0) {
                    ClipboardHelper.setText(this.f52553d.getContentTextView().mo154968a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$c$b */
        public static final class C18774b implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ FinderCollapsibleTextView f52554d;

            public C18774b(FinderCollapsibleTextView finderCollapsibleTextView) {
                this.f52554d = finderCollapsibleTextView;
            }

            public final void onDismiss() {
                this.f52554d.getContentTextView().setBackgroundResource(C0966R.color.ahf);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$c$c */
        public static final class C18775c implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public final /* synthetic */ FinderCollapsibleTextView f52555d;

            public C18775c(FinderCollapsibleTextView finderCollapsibleTextView) {
                this.f52555d = finderCollapsibleTextView;
            }

            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 0, 0, this.f52555d.getContext().getString(C0966R.string.f7936wt));
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$c$d */
        public static final class C18776d implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ FinderCollapsibleTextView f52556d;

            public C18776d(FinderCollapsibleTextView finderCollapsibleTextView) {
                this.f52556d = finderCollapsibleTextView;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i != 0) {
                    return;
                }
                if (this.f52556d.getRealContent() == null) {
                    ClipboardHelper.setText(this.f52556d.getContentTextView().mo154968a());
                } else {
                    ClipboardHelper.setText(this.f52556d.getRealContent());
                }
            }
        }

        public C18772c(FinderCollapsibleTextView finderCollapsibleTextView) {
            this.f52552d = finderCollapsibleTextView;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            try {
                C78253a aVar = new C78253a(this.f52552d.getContext());
                FinderCollapsibleTextView finderCollapsibleTextView = this.f52552d;
                aVar.f229251t = new C18773a(finderCollapsibleTextView);
                aVar.f229227C = new C18774b(finderCollapsibleTextView);
                finderCollapsibleTextView.getContentTextView().setBackgroundResource(C0966R.color.a1i);
                NeatTextView contentTextView = this.f52552d.getContentTextView();
                FinderCollapsibleTextView finderCollapsibleTextView2 = this.f52552d;
                C18775c cVar = new C18775c(finderCollapsibleTextView2);
                C18776d dVar = new C18776d(finderCollapsibleTextView2);
                int i = TouchableLayout.f24959d;
                aVar.mo108273h(contentTextView, cVar, dVar, TouchableLayout.f24959d, TouchableLayout.f24960e);
            } catch (Exception e) {
                Log.m105924i("Finder.CollapsibleTextView", "[enableContentTextViewClick] errMsg:" + e.getMessage());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$d */
    public static final class C18777d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCollapsibleTextView f52557d;

        public C18777d(FinderCollapsibleTextView finderCollapsibleTextView) {
            this.f52557d = finderCollapsibleTextView;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.neattextview.textview.view.NeatTextView");
            NeatTextView neatTextView = (NeatTextView) view;
            try {
                i = ((NeatTextView) view).getLayout().mo109129m0(this.f52557d.getLimitLine() - 1);
            } catch (ArrayIndexOutOfBoundsException unused) {
                i = -1;
            }
            FinderCollapsibleTextView finderCollapsibleTextView = this.f52557d;
            boolean z = finderCollapsibleTextView.f52544n;
            if ((z && i > 0) || !z) {
                finderCollapsibleTextView.mo23657e();
                Context context = this.f52557d.getContext();
                C87412m.m108593f(context, "context");
                FinderCollapsibleTextView finderCollapsibleTextView2 = this.f52557d;
                ((C58417y0) C86312j.m106911c(C58417y0.class)).sy0(context, false, 2, finderCollapsibleTextView2.f52544n, finderCollapsibleTextView2.f52543j);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$e */
    public static final class C18778e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCollapsibleTextView f52558d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$e$a */
        public static final class C18779a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8478d0 f52559d;

            /* renamed from: e */
            public final /* synthetic */ FinderCollapsibleTextView f52560e;

            /* renamed from: f */
            public final /* synthetic */ float f52561f;

            /* renamed from: g */
            public final /* synthetic */ int f52562g;

            public C18779a(C8478d0 d0Var, FinderCollapsibleTextView finderCollapsibleTextView, float f, int i) {
                this.f52559d = d0Var;
                this.f52560e = finderCollapsibleTextView;
                this.f52561f = f;
                this.f52562g = i;
            }

            public final void run() {
                this.f52559d.f27483d = this.f52560e.getContentTextView().getLayout().mo109131o0(this.f52560e.getLimitLine() - 1, Float.MAX_VALUE);
                this.f52560e.setCollapseTextViewRight(((float) this.f52562g) - ((this.f52560e.getContentTextView().getLayout().mo109120S(this.f52559d.f27483d) + this.f52561f) + this.f52560e.getCollapseTextView().getPaint().measureText("…")));
                FinderCollapsibleTextView finderCollapsibleTextView = this.f52560e;
                float collapseTextViewRight = finderCollapsibleTextView.getCollapseTextViewRight();
                if (0.0f >= collapseTextViewRight) {
                    collapseTextViewRight = 0.0f;
                }
                finderCollapsibleTextView.setCollapseTextViewRight(collapseTextViewRight);
                ViewGroup.LayoutParams layoutParams = this.f52560e.getCollapseTextView().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd((int) this.f52560e.getCollapseTextViewRight());
                this.f52560e.getCollapseTextView().setLayoutParams(layoutParams2);
                this.f52560e.mo23654c();
            }
        }

        public C18778e(FinderCollapsibleTextView finderCollapsibleTextView) {
            this.f52558d = finderCollapsibleTextView;
        }

        public final void run() {
            try {
                C8478d0 d0Var = new C8478d0();
                boolean z = true;
                d0Var.f27483d = this.f52558d.getContentTextView().getLayout().mo109131o0(this.f52558d.getLimitLine() - 1, Float.MAX_VALUE);
                float S = this.f52558d.getContentTextView().getLayout().mo109120S(d0Var.f27483d);
                int width = this.f52558d.getContentTextView().getWidth();
                FinderCollapsibleTextView finderCollapsibleTextView = this.f52558d;
                if (finderCollapsibleTextView.f52545o != 0.0f) {
                    z = false;
                }
                if (z) {
                    finderCollapsibleTextView.f52545o = finderCollapsibleTextView.getCollapseTextView().getPaint().measureText(this.f52558d.getContext().getResources().getString(C0966R.string.d0j));
                }
                FinderCollapsibleTextView finderCollapsibleTextView2 = this.f52558d;
                float f = finderCollapsibleTextView2.f52545o + ((float) 3);
                if (!finderCollapsibleTextView2.getContentTextView().f320006e || ((float) width) - S > f) {
                    if (S + f > ((float) width)) {
                        this.f52558d.getContentTextView().mo154992j(TextUtils.TruncateAt.END, f);
                    } else if (this.f52558d.getContentTextView().getExtraEllipsizeWidth() <= 0.0f) {
                        this.f52558d.getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
                    }
                    FinderCollapsibleTextView finderCollapsibleTextView3 = this.f52558d;
                    finderCollapsibleTextView3.post(new C18779a(d0Var, finderCollapsibleTextView3, f, width));
                    return;
                }
                FinderCollapsibleTextView.m19532b(this.f52558d, "#1");
            } catch (Exception e) {
                FinderCollapsibleTextView finderCollapsibleTextView4 = this.f52558d;
                FinderCollapsibleTextView.m19532b(finderCollapsibleTextView4, "#2:Exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView$f */
    public static final class C18780f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCollapsibleTextView f52563d;

        public C18780f(FinderCollapsibleTextView finderCollapsibleTextView) {
            this.f52563d = finderCollapsibleTextView;
        }

        public final void run() {
            FinderCollapsibleTextView finderCollapsibleTextView = this.f52563d;
            finderCollapsibleTextView.mo23658f(finderCollapsibleTextView.f52544n);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCollapsibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9o, this, true);
        getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
        getContentTextView().setOnTouchListener(new C107029o(getContentTextView(), new C75355a0()));
        mo23655d(true);
        getCollapseTextView().setOnClickListener(new C18782a1(this));
        this.f52544n = true;
        this.f52548r = 3;
    }

    /* renamed from: a */
    public static void m19531a(FinderCollapsibleTextView finderCollapsibleTextView, CharSequence charSequence, View view, C32226l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            lVar = C3936a.f17641d;
        }
        finderCollapsibleTextView.getClass();
        C87412m.m108594g(lVar, "callBack");
        finderCollapsibleTextView.setText(charSequence);
        if (view != null) {
            view.post(new C18783b1(view, finderCollapsibleTextView, charSequence, lVar));
        }
    }

    /* renamed from: b */
    public static final void m19532b(FinderCollapsibleTextView finderCollapsibleTextView, String str) {
        finderCollapsibleTextView.getClass();
        Log.m105924i("Finder.CollapsibleTextView", "go to defaule logic,source:" + str);
        finderCollapsibleTextView.getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
        ViewGroup.LayoutParams layoutParams = finderCollapsibleTextView.getCollapseTextView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(11);
        layoutParams2.removeRule(8);
        layoutParams2.addRule(3, C0966R.C0970id.bga);
        layoutParams2.addRule(5, C0966R.C0970id.bga);
        layoutParams2.setMarginEnd(0);
        finderCollapsibleTextView.getCollapseTextView().setLayoutParams(layoutParams2);
        finderCollapsibleTextView.mo23654c();
    }

    /* renamed from: c */
    public final void mo23654c() {
        CharSequence charSequence;
        CharSequence charSequence2 = this.f52547q;
        if (!(charSequence2 == null || charSequence2.length() == 0) && (charSequence = this.f52547q) != null) {
            post(new C18771b(this, charSequence));
        }
    }

    /* renamed from: d */
    public final void mo23655d(boolean z) {
        if (z) {
            getContentTextView().setOnLongClickListener(new C18772c(this));
            getContentTextView().setOnClickListener(new C18777d(this));
            getContentTextView().setBackgroundResource(C0966R.color.ahf);
            getContentTextView().setClickable(true);
            getContentTextView().setLongClickable(true);
            return;
        }
        getContentTextView().setOnLongClickListener((View.OnLongClickListener) null);
        getContentTextView().setOnClickListener((View.OnClickListener) null);
        getContentTextView().setBackgroundResource(C0966R.C0969drawable.ayq);
        getContentTextView().setClickable(false);
        getContentTextView().setLongClickable(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            getContentTextView().setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo23657e() {
        Log.m105924i("Finder.CollapsibleTextView", "on btn ClickFun");
        setCollapse(!this.f52544n);
        if (!this.f52544n) {
            ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).getClass();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIP_COLLAPSIBLE_INT;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i.mo119689j(aVar, 0) + 1));
        }
        mo23658f(this.f52544n);
        C32226l<? super Boolean, C13598b0> lVar = this.f52546p;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f52544n));
        }
    }

    /* renamed from: f */
    public final void mo23658f(boolean z) {
        if (getCollapseTextView().getVisibility() != 0) {
            getContentTextView().mo104279b(this.f52547q);
            getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
        } else if (z) {
            ViewGroup.LayoutParams layoutParams = getCollapseTextView().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(11);
            layoutParams2.addRule(8, C0966R.C0970id.bga);
            layoutParams2.removeRule(3);
            layoutParams2.removeRule(5);
            layoutParams2.setMarginEnd((int) this.f52539f);
            getCollapseTextView().setLayoutParams(layoutParams2);
            getCollapseTextView().setTextSize(0, getContentTextView().getTextSize());
            Log.m105924i("Finder.CollapsibleTextView", "isSpecialText:" + getContentTextView().f320006e);
            post(new C18778e(this));
        } else {
            getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
            ViewGroup.LayoutParams layoutParams3 = getCollapseTextView().getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.removeRule(11);
            layoutParams4.removeRule(8);
            layoutParams4.addRule(3, C0966R.C0970id.bga);
            layoutParams4.addRule(5, C0966R.C0970id.bga);
            layoutParams4.setMarginEnd(0);
            getCollapseTextView().setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: g */
    public final boolean mo23659g() {
        int i;
        try {
            i = getContentTextView().getLayout().mo109129m0(this.f52548r - 1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            i = -1;
        }
        if (!this.f52544n || i <= 0) {
            return false;
        }
        mo23657e();
        return true;
    }

    public final TextView getCollapseTextView() {
        return (TextView) this.f52538e.getValue();
    }

    public final float getCollapseTextViewRight() {
        return this.f52539f;
    }

    public final NeatTextView getContentTextView() {
        return (NeatTextView) this.f52537d.getValue();
    }

    public final int getExpanText() {
        return this.f52541h;
    }

    public final int getExpandTextColor() {
        return getCollapseTextView().getCurrentTextColor();
    }

    public final View getExtraView() {
        return this.f52542i;
    }

    public final int getLimitLine() {
        return this.f52548r;
    }

    public final int getLocalExpanText() {
        return this.f52540g;
    }

    public final C32226l<Boolean, C13598b0> getOnCollapse() {
        return this.f52546p;
    }

    public final CharSequence getRealContent() {
        return this.f52549s;
    }

    public final CharSequence getText() {
        return this.f52547q;
    }

    public final int getTextColor() {
        return getContentTextView().getCurrentTextColor();
    }

    public final float getTextSize() {
        return getContentTextView().getTextSize();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            super.onMeasure(r6, r7)
            com.tencent.neattextview.textview.view.NeatTextView r0 = r5.getContentTextView()
            yr3.a r0 = r0.getLayout()
            r1 = 1
            r2 = 0
            int r3 = r5.f52548r     // Catch:{ Exception -> 0x0021 }
            int r4 = r0.mo109128l0()     // Catch:{ Exception -> 0x0021 }
            if (r3 <= r4) goto L_0x0016
            r3 = r4
        L_0x0016:
            int r3 = r3 - r1
            if (r3 < 0) goto L_0x0026
            r4 = 1176256512(0x461c4000, float:10000.0)
            int r3 = r0.mo109131o0(r3, r4)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0027
        L_0x0021:
            r3 = move-exception
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 != 0) goto L_0x0064
        L_0x0026:
            r3 = 0
        L_0x0027:
            android.widget.TextView r4 = r5.getCollapseTextView()
            int r4 = r4.getVisibility()
            if (r0 == 0) goto L_0x0049
            if (r3 <= 0) goto L_0x0049
            com.tencent.neattextview.textview.view.NeatTextView r0 = r5.getContentTextView()
            java.lang.CharSequence r0 = r0.mo154968a()
            int r0 = r0.length()
            if (r3 >= r0) goto L_0x0049
            android.widget.TextView r0 = r5.getCollapseTextView()
            r0.setVisibility(r2)
            goto L_0x0052
        L_0x0049:
            android.widget.TextView r0 = r5.getCollapseTextView()
            r3 = 8
            r0.setVisibility(r3)
        L_0x0052:
            android.widget.TextView r0 = r5.getCollapseTextView()
            int r0 = r0.getVisibility()
            if (r4 == r0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            super.onMeasure(r6, r7)
        L_0x0063:
            return
        L_0x0064:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView.onMeasure(int, int):void");
    }

    public final void setCollapse(boolean z) {
        this.f52544n = z;
        if (z) {
            if (getContentTextView().getMaxLines() != this.f52548r) {
                getContentTextView().setMaxLines(this.f52548r);
            }
            getCollapseTextView().setText(this.f52541h);
            return;
        }
        if (getContentTextView().getMaxLines() != Integer.MAX_VALUE) {
            getContentTextView().setMaxLines(Integer.MAX_VALUE);
        }
        getCollapseTextView().setText(C0966R.string.bfo);
    }

    public final void setCollapseTextViewRight(float f) {
        this.f52539f = f;
    }

    public final void setExpanText(int i) {
        this.f52541h = i;
    }

    public final void setExpandTextColor(int i) {
        getCollapseTextView().setTextColor(i);
    }

    public final void setExtraView(View view) {
        this.f52542i = view;
    }

    public final void setLimitLine(int i) {
        this.f52548r = i;
        if (getContentTextView().getMaxLines() != i) {
            getContentTextView().setMaxLines(i);
        }
    }

    public final void setLocalExpanText(int i) {
        this.f52540g = i;
    }

    public final void setOnCollapse(C32226l<? super Boolean, C13598b0> lVar) {
        this.f52546p = lVar;
    }

    public final void setRealContent(CharSequence charSequence) {
        this.f52549s = charSequence;
    }

    public final void setText(CharSequence charSequence) {
        this.f52547q = charSequence;
        getContentTextView().mo104279b(charSequence);
        post(new C18780f(this));
    }

    public final void setTextColor(int i) {
        getContentTextView().setTextColor(i);
    }

    public final void setTextSize(float f) {
        getContentTextView().setTextSize(f);
    }

    public final void setTopicExpand(boolean z) {
        this.f52543j = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCollapsibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9o, this, true);
        getContentTextView().mo154992j(TextUtils.TruncateAt.END, 0.0f);
        getContentTextView().setOnTouchListener(new C107029o(getContentTextView(), new C75355a0()));
        mo23655d(true);
        getCollapseTextView().setOnClickListener(new C18782a1(this));
        this.f52544n = true;
        this.f52548r = 3;
    }
}
