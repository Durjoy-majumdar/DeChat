package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C7435f2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C48878bm1;
import te3.C49712hj1;
import te3.C64586nn1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0002@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView;", "Landroid/widget/FrameLayout;", "Lorg/json/JSONObject;", "getReportJson", "", "visibility", "Lrx3/b0;", "setVisibility", "", "value", "d", "Z", "setShowing", "(Z)V", "isShowing", "Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$b;", "e", "Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$b;", "getVisibilityListener", "()Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$b;", "setVisibilityListener", "(Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$b;)V", "visibilityListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView */
public final class FinderHomeTabRedDotTipsBubbleView extends FrameLayout {

    /* renamed from: h */
    public static boolean f17793h;

    /* renamed from: i */
    public static boolean f17794i;

    /* renamed from: d */
    public boolean f17795d;

    /* renamed from: e */
    public C3958b f17796e;

    /* renamed from: f */
    public JSONObject f17797f = new JSONObject();

    /* renamed from: g */
    public C48878bm1 f17798g;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView$a */
    public static final class C3957a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeTabRedDotTipsBubbleView f17799d;

        public C3957a(FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView) {
            this.f17799d = finderHomeTabRedDotTipsBubbleView;
        }

        public final void onClick(View view) {
            Class cls = C13442s8.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f17799d;
            boolean z = FinderHomeTabRedDotTipsBubbleView.f17793h;
            if (finderHomeTabRedDotTipsBubbleView.mo4564b()) {
                boolean z2 = FinderHomeTabRedDotTipsBubbleView.f17793h;
                FinderHomeTabRedDotTipsBubbleView.f17793h = true;
                FinderTabSelectedEvent finderTabSelectedEvent = new FinderTabSelectedEvent();
                finderTabSelectedEvent.f9251d.f9252a = 3;
                finderTabSelectedEvent.publish();
            } else {
                boolean z3 = FinderHomeTabRedDotTipsBubbleView.f17793h;
                FinderHomeTabRedDotTipsBubbleView.f17794i = true;
                FinderTabSelectedEvent finderTabSelectedEvent2 = new FinderTabSelectedEvent();
                finderTabSelectedEvent2.f9251d.f9252a = 1;
                finderTabSelectedEvent2.publish();
            }
            if (this.f17799d.mo4564b()) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f17799d.getContext();
                C87412m.m108593f(context, "context");
                C7435f2.f25626a.mo8577a(((C13442s8) rVar.mo62443b(context).mo75002a(cls)).mo12853i3(3), "followtab_tl_bubble", 1, this.f17799d.f17797f);
            } else {
                C39818r rVar2 = C39818r.f106831a;
                Context context2 = this.f17799d.getContext();
                C87412m.m108593f(context2, "context");
                C7435f2.f25626a.mo8577a(((C13442s8) rVar2.mo62443b(context2).mo75002a(cls)).mo12853i3(1), "friendtab_tl_bubble", 1, this.f17799d.f17797f);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView$b */
    public interface C3958b {
        /* renamed from: a */
        void mo4572a(boolean z);

        /* renamed from: b */
        void mo4573b();
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView$c */
    public static final class C3959c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeTabRedDotTipsBubbleView f17800d;

        public C3959c(FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView) {
            this.f17800d = finderHomeTabRedDotTipsBubbleView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f17800d.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setVisibility(8);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ckt, this, true);
        setOnClickListener(new C3957a(this));
    }

    private final JSONObject getReportJson() {
        String str;
        Object obj;
        String str2;
        JSONObject jSONObject = new JSONObject();
        C48878bm1 bm12 = this.f17798g;
        byte[] bArr = null;
        C64586nn1 nn12 = bm12 != null ? bm12.f131200e : null;
        String str3 = "";
        if (nn12 == null || (str = nn12.f184504f) == null) {
            str = str3;
        }
        jSONObject.put("wording", str);
        C48878bm1 bm13 = this.f17798g;
        if (!(bm13 == null || (str2 = bm13.f131203h) == null)) {
            str3 = str2;
        }
        jSONObject.put("tipsid", str3);
        C48878bm1 bm14 = this.f17798g;
        jSONObject.put("feedid", C61926c.m72691p(bm14 != null ? bm14.f131202g : 0));
        if ((nn12 != null ? nn12.f184510o : null) != null && nn12.f184509n == 1) {
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
            C89349b bVar = nn12.f184510o;
            if (bVar != null) {
                bArr = bVar.mo123703f();
            }
            finderTipsShowEntranceExtInfo.parseFrom(bArr);
            String str4 = finderTipsShowEntranceExtInfo.username;
            if (str4 == null || str4.length() == 0) {
                LinkedList<String> linkedList = finderTipsShowEntranceExtInfo.multi_username;
                C87412m.m108593f(linkedList, "ext.multi_username");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (String str5 : linkedList) {
                    arrayList.add(str5 + '|');
                }
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (!C87412m.m108589b((String) listIterator.previous(), "|")) {
                                obj = C110818d0.m150947s0(arrayList, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                obj = C64186f0.f181907d;
                jSONObject.put("friendusername", obj);
            } else {
                jSONObject.put("friendusername", String.valueOf(finderTipsShowEntranceExtInfo.username));
            }
        }
        return jSONObject;
    }

    private final void setShowing(boolean z) {
        ConcurrentSkipListSet<String> concurrentSkipListSet = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().f158530g;
        if (z) {
            if (mo4564b()) {
                concurrentSkipListSet.add("TLFollow");
            } else {
                concurrentSkipListSet.add("TLRecommendTab");
            }
        }
        this.f17795d = z;
    }

    /* renamed from: a */
    public final boolean mo4563a(boolean z) {
        if (getVisibility() != 0) {
            return false;
        }
        if (z) {
            animate().cancel();
            animate().alpha(0.0f).setDuration(250).setListener(new C3959c(this)).start();
        } else {
            setVisibility(8);
        }
        C3958b bVar = this.f17796e;
        if (bVar == null) {
            return true;
        }
        bVar.mo4573b();
        return true;
    }

    /* renamed from: b */
    public final boolean mo4564b() {
        C48878bm1 bm12 = this.f17798g;
        return bm12 != null && bm12.f131199d == 2;
    }

    /* renamed from: c */
    public final void mo4565c(C48878bm1 bm12) {
        C64586nn1 nn12;
        StringBuilder sb = new StringBuilder();
        sb.append("[show] show_reddot=");
        sb.append(bm12 != null ? Integer.valueOf(bm12.f131199d) : null);
        sb.append(", show_type=");
        sb.append((bm12 == null || (nn12 = bm12.f131200e) == null) ? null : Integer.valueOf(nn12.f184502d));
        Log.m105924i("Finder.HomeTabRedDotTipsBubbleView", sb.toString());
        this.f17798g = bm12;
        this.f17797f = getReportJson();
        if (getVisibility() != 0) {
            setVisibility(0);
            setAlpha(0.0f);
            ViewPropertyAnimator animate = animate();
            if (animate != null) {
                animate.cancel();
            }
            animate().alpha(1.0f).setDuration(250).setListener((Animator.AnimatorListener) null).start();
            C39818r rVar = C39818r.f106831a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
            if (mo4564b()) {
                C7435f2.f25626a.mo8577a(q3, "followtab_tl_bubble", 0, this.f17797f);
            } else {
                C7435f2.f25626a.mo8577a(q3, "friendtab_tl_bubble", 0, this.f17797f);
            }
        }
        mo4566d(this.f17798g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r10 = (r10 = r10.f131200e).f184501B;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4566d(te3.C48878bm1 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            up1.y r2 = up1.C27696y.MEDIUM_AVATAR_IMAGE
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            r6 = 1
            r7 = 0
            r8 = 8
            if (r1 != 0) goto L_0x0012
            goto L_0x00c3
        L_0x0012:
            te3.nn1 r9 = r1.f131200e
            if (r9 == 0) goto L_0x00c3
            te3.t10 r9 = r9.f184501B
            if (r9 == 0) goto L_0x00c3
            te3.en1 r9 = r9.f141896d
            if (r9 != 0) goto L_0x0020
            goto L_0x00c3
        L_0x0020:
            te3.bm1 r10 = r0.f17798g
            if (r10 == 0) goto L_0x002f
            te3.nn1 r10 = r10.f131200e
            if (r10 == 0) goto L_0x002f
            te3.t10 r10 = r10.f184501B
            if (r10 == 0) goto L_0x002f
            te3.en1 r10 = r10.f141896d
            goto L_0x0030
        L_0x002f:
            r10 = 0
        L_0x0030:
            boolean r10 = r9.compareContent(r10)
            if (r10 == 0) goto L_0x0038
            goto L_0x00c1
        L_0x0038:
            r10 = 2131301221(0x7f091365, float:1.8220494E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x006e
            r10.setVisibility(r7)
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r11 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView
            android.content.Context r12 = r19.getContext()
            r11.<init>(r12)
            android.content.res.Resources r12 = r11.getResources()
            r13 = 2131166460(0x7f0704fc, float:1.7947166E38)
            float r12 = r12.getDimension(r13)
            int r12 = (int) r12
            java.util.LinkedList<te3.lr3> r9 = r9.f133024d
            java.lang.String r13 = "render.nodes"
            gy3.C87412m.m108593f(r9, r13)
            r11.mo149645c(r12, r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r12 = -2
            r9.<init>(r12, r12)
            r10.addView(r11, r9)
        L_0x006e:
            r9 = 2131315322(0x7f094a7a, float:1.8249094E38)
            android.view.View r9 = r0.findViewById(r9)
            if (r9 != 0) goto L_0x0078
            goto L_0x00c1
        L_0x0078:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView"
            java.lang.String r13 = "updateDsl"
            java.lang.String r14 = "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;)Z"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r9
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r9.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView"
            java.lang.String r12 = "updateDsl"
            java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;)Z"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00c1:
            r5 = 1
            goto L_0x00c4
        L_0x00c3:
            r5 = 0
        L_0x00c4:
            if (r5 == 0) goto L_0x00c7
            return
        L_0x00c7:
            r0.f17798g = r1
            if (r1 == 0) goto L_0x00ce
            te3.nn1 r1 = r1.f131200e
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00d4
            java.util.LinkedList<java.lang.String> r5 = r1.f184511p
            goto L_0x00d5
        L_0x00d4:
            r5 = 0
        L_0x00d5:
            if (r5 != 0) goto L_0x00dc
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
        L_0x00dc:
            boolean r9 = r5.isEmpty()
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0102
            if (r1 == 0) goto L_0x00e9
            java.lang.String r9 = r1.f184505g
            goto L_0x00ea
        L_0x00e9:
            r9 = 0
        L_0x00ea:
            if (r9 == 0) goto L_0x00f5
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r9 = 0
            goto L_0x00f6
        L_0x00f5:
            r9 = 1
        L_0x00f6:
            if (r9 != 0) goto L_0x0102
            if (r1 == 0) goto L_0x00fe
            java.lang.String r9 = r1.f184505g
            if (r9 != 0) goto L_0x00ff
        L_0x00fe:
            r9 = r10
        L_0x00ff:
            r5.add(r9)
        L_0x0102:
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x010b
            r0.setVisibility(r8)
        L_0x010b:
            r9 = 2131305218(0x7f092302, float:1.82286E38)
            android.view.View r9 = r0.findViewById(r9)
            java.lang.String r11 = "findViewById(id)"
            gy3.C87412m.m108593f(r9, r11)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r12 = 2131305219(0x7f092303, float:1.8228603E38)
            android.view.View r12 = r0.findViewById(r12)
            gy3.C87412m.m108593f(r12, r11)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 2131305220(0x7f092304, float:1.8228605E38)
            android.view.View r13 = r0.findViewById(r13)
            gy3.C87412m.m108593f(r13, r11)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r9.setVisibility(r8)
            r12.setVisibility(r8)
            r13.setVisibility(r8)
            r14 = 2131315352(0x7f094a98, float:1.8249155E38)
            android.view.View r14 = r0.findViewById(r14)
            gy3.C87412m.m108593f(r14, r11)
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r1 == 0) goto L_0x014d
            java.lang.String r15 = r1.f184504f
            if (r15 == 0) goto L_0x014d
            goto L_0x015c
        L_0x014d:
            android.content.Context r15 = r19.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r8 = 2131826589(0x7f11179d, float:1.9286067E38)
            java.lang.String r15 = r15.getString(r8)
        L_0x015c:
            r14.setText(r15)
            er1.C7919x.m8091a(r14)
            android.content.res.Resources r8 = r14.getResources()
            int r15 = r5.size()
            if (r15 <= r6) goto L_0x0170
            r15 = 2131165318(0x7f070086, float:1.794485E38)
            goto L_0x0173
        L_0x0170:
            r15 = 2131166456(0x7f0704f8, float:1.7947158E38)
        L_0x0173:
            float r8 = r8.getDimension(r15)
            int r8 = (int) r8
            r14.setMaxWidth(r8)
            r8 = 2131315331(0x7f094a83, float:1.8249112E38)
            android.view.View r8 = r0.findViewById(r8)
            gy3.C87412m.m108593f(r8, r11)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            if (r1 == 0) goto L_0x0194
            te3.s7 r11 = r1.f184519x
            if (r11 == 0) goto L_0x0194
            te3.f00 r11 = r11.f185355d
            if (r11 == 0) goto L_0x0194
            te3.wc4 r11 = r11.f183066e
            goto L_0x0195
        L_0x0194:
            r11 = 0
        L_0x0195:
            if (r11 == 0) goto L_0x019d
            java.lang.String r11 = r11.f186074e
            if (r11 != 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r10 = r11
        L_0x019d:
            android.content.Context r11 = r19.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r14 = 2131100925(0x7f0604fd, float:1.7814245E38)
            int r11 = r11.getColor(r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r14 = r14 ^ r6
            if (r14 == 0) goto L_0x021e
            r8.setVisibility(r7)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "loadHighLightIcon: iconUrl"
            r14.append(r15)
            r14.append(r10)
            java.lang.String r15 = " highLightColor:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "Finder.HomeTabRedDotTipsBubbleView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r15 = r14.mo62446e(r3)
            bl3.c r15 = r15.mo62447c(r4)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11871f2()
            pl1.n0 r7 = new pl1.n0
            up1.y r6 = up1.C27696y.THUMB_IMAGE
            r7.<init>(r10, r6)
            pl1.e0$a r6 = pl1.C11978e0.C11979a.LINK_THUMB
            bl3.r$a r14 = r14.mo62446e(r3)
            bl3.c r14 = r14.mo62447c(r4)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r6 = r14.mo11867O2(r6)
            l60.b r6 = r15.mo85956b(r7, r6)
            com.tencent.mm.plugin.finder.view.x2 r7 = new com.tencent.mm.plugin.finder.view.x2
            r7.<init>(r8, r11, r10)
            r6.getClass()
            r6.f291320d = r7
            com.tencent.mm.plugin.finder.view.y2 r7 = new com.tencent.mm.plugin.finder.view.y2
            r7.<init>(r10, r8, r11)
            r6.f291324h = r7
            com.tencent.mm.plugin.finder.view.z2 r7 = new com.tencent.mm.plugin.finder.view.z2
            r7.<init>(r8)
            r6.f291323g = r7
            r6.mo85951a()
            r8.setIconColor(r11)
            goto L_0x0223
        L_0x021e:
            r6 = 8
            r8.setVisibility(r6)
        L_0x0223:
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0228:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02b4
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x02af
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L_0x0249
            r10 = 1
            if (r6 == r10) goto L_0x0243
            r6 = 0
            r13.setVisibility(r6)
            r11 = r13
            goto L_0x024f
        L_0x0243:
            r6 = 0
            r12.setVisibility(r6)
            r11 = r12
            goto L_0x024f
        L_0x0249:
            r6 = 0
            r10 = 1
            r9.setVisibility(r6)
            r11 = r9
        L_0x024f:
            if (r1 == 0) goto L_0x0258
            int r14 = r1.f184502d
            r15 = 4
            if (r14 != r15) goto L_0x0258
            r14 = 1
            goto L_0x0259
        L_0x0258:
            r14 = 0
        L_0x0259:
            if (r14 == 0) goto L_0x0284
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r15 = r14.mo62446e(r3)
            bl3.c r15 = r15.mo62447c(r4)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11872i2()
            pl1.f r6 = new pl1.f
            r6.<init>(r7, r2)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r14 = r14.mo62446e(r3)
            bl3.c r14 = r14.mo62447c(r4)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r7 = r14.mo11867O2(r7)
            r15.mo85957c(r6, r11, r7)
            goto L_0x02ac
        L_0x0284:
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r14 = r6.mo62446e(r3)
            bl3.c r14 = r14.mo62447c(r4)
            pl1.s0 r14 = (pl1.C11990s0) r14
            k60.d r14 = r14.mo11865K1()
            pl1.f r15 = new pl1.f
            r15.<init>(r7, r2)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r6 = r6.mo62446e(r3)
            bl3.c r6 = r6.mo62447c(r4)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r7)
            r14.mo85957c(r15, r11, r6)
        L_0x02ac:
            r6 = r8
            goto L_0x0228
        L_0x02af:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.mo4566d(te3.bm1):void");
    }

    public final C3958b getVisibilityListener() {
        return this.f17796e;
    }

    public void onDetachedFromWindow() {
        C3958b bVar;
        super.onDetachedFromWindow();
        boolean z = this.f17795d;
        setShowing(false);
        if (this.f17795d != z && (bVar = this.f17796e) != null) {
            bVar.mo4572a(false);
        }
    }

    public void setVisibility(int i) {
        C3958b bVar;
        super.setVisibility(i);
        boolean z = this.f17795d;
        setShowing(i == 0);
        boolean z2 = this.f17795d;
        if (z2 != z && (bVar = this.f17796e) != null) {
            bVar.mo4572a(z2);
        }
    }

    public final void setVisibilityListener(C3958b bVar) {
        this.f17796e = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setVisibility(8);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ckt, this, true);
        setOnClickListener(new C3957a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setVisibility(8);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ckt, this, true);
        setOnClickListener(new C3957a(this));
    }
}
