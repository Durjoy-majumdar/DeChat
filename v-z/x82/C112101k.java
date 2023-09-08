package x82;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import nj3.C76912y0;
import rx3.C13598b0;
import v82.C111415a1;
import x82.C112075a;
import x82.C112095g;

/* renamed from: x82.k */
public final class C112101k extends C112124u {

    /* renamed from: G */
    public FrameLayout f335619G;

    /* renamed from: H */
    public RelativeLayout f335620H;

    /* renamed from: I */
    public C112080b0 f335621I;

    /* renamed from: J */
    public XFileSdk.ViewStatus f335622J;

    /* renamed from: K */
    public int f335623K = -1;

    /* renamed from: L */
    public boolean f335624L;

    /* renamed from: M */
    public String f335625M;

    /* renamed from: N */
    public String f335626N;

    /* renamed from: P */
    public String f335627P;

    /* renamed from: Q */
    public int f335628Q = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112101k(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        int[] iArr = {1};
        for (int i = 0; i < 1; i++) {
            hashSet.add(Integer.valueOf(iArr[i]));
        }
        String string = getContext().getResources().getString(C0966R.string.ifm);
        C87412m.m108593f(string, "context.resources.getStr…n_projector_clear_screen)");
        C112095g.C38462a[] aVarArr = {new C112095g.C38462a(string, 8)};
        for (int i2 = 0; i2 < 1; i2++) {
            hashSet2.add(aVarArr[i2]);
        }
        int[] iArr2 = {9, 10};
        for (int i3 = 0; i3 < 2; i3++) {
            hashSet3.add(Integer.valueOf(iArr2[i3]));
        }
        setScreenFuncConfig(new C112095g(hashSet, hashSet2, hashSet3, 2));
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.f335620H = (RelativeLayout) findViewById(C0966R.C0970id.j3e);
        setMReadyLayout((FrameLayout) findViewById(C0966R.C0970id.j3a));
        setMEditLayout((FrameLayout) findViewById(C0966R.C0970id.j3d));
        setBottomRoot((FrameLayout) findViewById(C0966R.C0970id.j37));
        setTopRoot((FrameLayout) findViewById(C0966R.C0970id.j3b));
        setAvatarRoot((FrameLayout) findViewById(C0966R.C0970id.j3c));
        this.f335619G = (FrameLayout) findViewById(C0966R.C0970id.j3f);
        RelativeLayout relativeLayout = this.f335620H;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        FrameLayout mEditLayout = getMEditLayout();
        if (mEditLayout != null) {
            mEditLayout.setVisibility(8);
        }
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        setMultiTalkStrokeContext(new C112079b(context2, this, getScreenFuncConfig()));
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335543m = new C112097h(this);
        }
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        setTopUiLayout(new C112083c0(context3, this));
        Context context4 = getContext();
        C87412m.m108593f(context4, "context");
        setAvatarLayout(new C112113q(context4, this));
        Context context5 = getContext();
        C87412m.m108593f(context5, "context");
        setBottomUiLayout(new C112114r(context5, this, getScreenFuncConfig()));
        Context context6 = getContext();
        C87412m.m108593f(context6, "context");
        this.f335621I = new C112080b0(context6, this);
        Context context7 = getContext();
        C87412m.m108593f(context7, "context");
        setReadyUI(new C112093f0(context7, this, getScreenFuncConfig()));
        setMScreenReportData(new C112096g0());
        mo163807o();
    }

    /* access modifiers changed from: private */
    public final void setMCurrentIndex(int i) {
        this.f335628Q = i;
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335540j = i;
            C32226l<? super Integer, C13598b0> lVar = multiTalkStrokeContext.f335543m;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(Integer.valueOf(i));
            }
        }
        C112080b0 b0Var = this.f335621I;
        if (b0Var != null) {
            C112134y yVar = b0Var.f335554j;
            if (yVar != null) {
                yVar.f335739h = i;
            }
            b0Var.f335557m = i;
        }
    }

    private final void setMFilePath(String str) {
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335539i = str;
        }
        this.f335626N = str;
    }

    /* access modifiers changed from: private */
    public final void setMMaxCount(int i) {
        this.f335623K = i;
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335541k = i;
        }
        C112080b0 b0Var = this.f335621I;
        if (b0Var != null) {
            C112134y yVar = b0Var.f335554j;
            if (yVar != null) {
                yVar.f335740i = i;
            }
            b0Var.f335563s = (i / 10) + 1;
            b0Var.f335558n = i;
        }
    }

    private final void setMToken(String str) {
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335538h = str;
        }
        this.f335625M = str;
    }

    /* renamed from: c */
    public void mo163772c(C112075a.C112077b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo163772c(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            C112080b0 b0Var = this.f335621I;
            if (b0Var != null) {
                b0Var.mo163779a();
            }
        } else if (ordinal == 3) {
            C112080b0 b0Var2 = this.f335621I;
            if (b0Var2 != null) {
                b0Var2.mo163781c();
            }
        } else if (ordinal != 9) {
            boolean z = false;
            switch (ordinal) {
                case 11:
                    if (!this.f335718y) {
                        int i = this.f335628Q + 1;
                        if (i >= 0 && i < this.f335623K) {
                            z = true;
                        }
                        if (z) {
                            mo163878i();
                            C112080b0 b0Var3 = this.f335621I;
                            if (b0Var3 != null) {
                                b0Var3.mo163782d(i);
                                return;
                            }
                            return;
                        }
                        C76912y0.m92773l(getContext(), "没有更多内容");
                        return;
                    }
                    return;
                case 12:
                    if (!this.f335718y) {
                        int i2 = this.f335628Q - 1;
                        if (i2 >= 0 && i2 < this.f335623K) {
                            z = true;
                        }
                        if (z) {
                            mo163878i();
                            C112080b0 b0Var4 = this.f335621I;
                            if (b0Var4 != null) {
                                b0Var4.mo163782d(i2);
                                return;
                            }
                            return;
                        }
                        C76912y0.m92773l(getContext(), "没有更多内容");
                        return;
                    }
                    return;
                case 13:
                    if (bundle != null) {
                        int i3 = bundle.getInt("thumb_current_page");
                        int i4 = i3 * 10;
                        int i5 = (i3 + 1) * 10;
                        int i6 = this.f335623K;
                        if (i5 >= i6) {
                            i5 = i6;
                        }
                        if (i4 <= i5) {
                            while (true) {
                                XFileSdk.requestThumbnail(this.f335625M, this.f335626N, i4);
                                if (i4 != i5) {
                                    i4++;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        } else if (bundle != null) {
            int i7 = bundle.getInt("thumb_flip_target_position");
            mo163878i();
            XFileSdk.setViewToStatus(this.f335625M, this.f335626N, i7, 1.0f, 0, 0);
        }
    }

    /* renamed from: g */
    public void mo163799g() {
        RelativeLayout relativeLayout = this.f335620H;
        if (relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C111415a1.C111416a aVar = C111415a1.f333534e;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            if (aVar.mo163079a(context) != 90) {
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                if (aVar.mo163079a(context2) != 270) {
                    layoutParams.removeRule(16);
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(17);
                    layoutParams.removeRule(2);
                    FrameLayout topRoot = getTopRoot();
                    C87412m.m108591d(topRoot);
                    layoutParams.addRule(3, topRoot.getId());
                    FrameLayout bottomRoot = getBottomRoot();
                    C87412m.m108591d(bottomRoot);
                    layoutParams.addRule(2, bottomRoot.getId());
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            layoutParams.removeRule(16);
            layoutParams.removeRule(3);
            layoutParams.removeRule(17);
            layoutParams.removeRule(2);
            FrameLayout topRoot2 = getTopRoot();
            C87412m.m108591d(topRoot2);
            layoutParams.addRule(17, topRoot2.getId());
            FrameLayout bottomRoot2 = getBottomRoot();
            C87412m.m108591d(bottomRoot2);
            layoutParams.addRule(16, bottomRoot2.getId());
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    public View getBackgroundView() {
        return this.f335620H;
    }

    public String getCurrentFileMd5() {
        return C86013q1.m106456q(this.f335626N);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bht;
    }

    public final XFileSdk.ViewStatus getMCurrentViewStatus() {
        return this.f335622J;
    }

    public final RelativeLayout getMReaderLayout() {
        return this.f335620H;
    }

    public final C112080b0 getThumbUiLayout() {
        return this.f335621I;
    }

    public final FrameLayout getThumbnailRoot() {
        return this.f335619G;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo163804h() {
        /*
            r20 = this;
            r0 = r20
            android.widget.FrameLayout r1 = r0.f335619G
            if (r1 == 0) goto L_0x01f6
            r1.removeAllViews()
            v82.a1$a r2 = v82.C111415a1.f333534e
            android.content.Context r3 = r20.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            int r3 = r2.mo163079a(r3)
            r5 = 90
            r6 = 12
            r7 = 17
            r8 = 16
            r9 = 3
            r10 = 2
            r11 = -1
            if (r3 == r5) goto L_0x0068
            android.content.Context r3 = r20.getContext()
            gy3.C87412m.m108593f(r3, r4)
            int r2 = r2.mo163079a(r3)
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0035
            goto L_0x0068
        L_0x0035:
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            int r3 = v82.C111418b0.f333556q
            r2.<init>(r11, r3)
            r2.removeRule(r10)
            r2.removeRule(r9)
            r2.removeRule(r6)
            r2.removeRule(r8)
            r2.removeRule(r7)
            android.widget.FrameLayout r3 = r20.getBottomRoot()
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getId()
            r2.addRule(r10, r3)
            android.widget.FrameLayout r3 = r20.getTopRoot()
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getId()
            r2.addRule(r9, r3)
            goto L_0x009a
        L_0x0068:
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            int r3 = v82.C111418b0.f333556q
            r2.<init>(r3, r11)
            r2.removeRule(r10)
            r2.removeRule(r9)
            r2.removeRule(r6)
            r2.removeRule(r8)
            r2.removeRule(r7)
            android.widget.FrameLayout r3 = r20.getTopRoot()
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getId()
            r2.addRule(r7, r3)
            android.widget.FrameLayout r3 = r20.getBottomRoot()
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getId()
            r2.addRule(r8, r3)
        L_0x009a:
            r1.setLayoutParams(r2)
            x82.b0 r2 = r0.f335621I
            if (r2 == 0) goto L_0x01f6
            android.content.Context r3 = r20.getContext()
            gy3.C87412m.m108593f(r3, r4)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131496742(0x7f0c0f26, float:1.8617057E38)
            android.view.View r1 = r3.inflate(r4, r1)
            r2.f335548d = r1
            x82.y r1 = new x82.y
            x82.a r3 = r2.f335546b
            r1.<init>(r3)
            r2.f335554j = r1
            android.view.View r1 = r2.f335548d
            r3 = 0
            if (r1 == 0) goto L_0x00cd
            r4 = 2131312821(0x7f0940b5, float:1.8244021E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            goto L_0x00ce
        L_0x00cd:
            r1 = r3
        L_0x00ce:
            r2.f335553i = r1
            android.view.View r1 = r2.f335548d
            if (r1 == 0) goto L_0x00de
            r4 = 2131312830(0x7f0940be, float:1.824404E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            goto L_0x00df
        L_0x00de:
            r1 = r3
        L_0x00df:
            r2.f335555k = r1
            android.view.View r1 = r2.f335548d
            if (r1 == 0) goto L_0x00ed
            r4 = 2131309723(0x7f09349b, float:1.8237738E38)
            android.view.View r1 = r1.findViewById(r4)
            goto L_0x00ee
        L_0x00ed:
            r1 = r3
        L_0x00ee:
            r2.f335556l = r1
            android.widget.FrameLayout r1 = r2.f335555k
            if (r1 == 0) goto L_0x011b
            r1.removeAllViews()
            x82.y r4 = r2.f335554j
            if (r4 == 0) goto L_0x0100
            android.content.Context r5 = r2.f335545a
            r4.mo163916c(r5, r1)
        L_0x0100:
            java.lang.String r1 = r2.f335559o
            if (r1 == 0) goto L_0x010b
            x82.y r4 = r2.f335554j
            if (r4 == 0) goto L_0x010b
            r4.mo163918e(r1)
        L_0x010b:
            x82.y r1 = r2.f335554j
            if (r1 != 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            int r4 = r2.f335557m
            r1.f335739h = r4
        L_0x0114:
            if (r1 != 0) goto L_0x0117
            goto L_0x011b
        L_0x0117:
            int r4 = r2.f335558n
            r1.f335740i = r4
        L_0x011b:
            android.view.View r1 = r2.f335548d
            if (r1 == 0) goto L_0x0129
            r4 = 2131312835(0x7f0940c3, float:1.824405E38)
            android.view.View r1 = r1.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            goto L_0x012a
        L_0x0129:
            r1 = r3
        L_0x012a:
            r2.f335552h = r1
            a92.e r1 = new a92.e
            android.content.Context r4 = r2.f335545a
            r1.<init>(r4)
            r2.f335550f = r1
            a92.b r1 = new a92.b
            androidx.recyclerview.widget.RecyclerView r4 = r2.f335552h
            android.content.Context r5 = r2.f335545a
            r1.<init>(r4, r5)
            r2.f335551g = r1
            com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager r1 = new com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager
            androidx.recyclerview.widget.RecyclerView r4 = r2.f335552h
            android.content.Context r5 = r2.f335545a
            r6 = 0
            r1.<init>(r4, r5, r6)
            r2.f335549e = r1
            androidx.recyclerview.widget.RecyclerView r4 = r2.f335552h
            if (r4 == 0) goto L_0x0158
            x82.z r5 = new x82.z
            r5.<init>(r2, r1)
            r4.setOnScrollListener(r5)
        L_0x0158:
            a92.b r1 = r2.f335551g
            if (r1 == 0) goto L_0x0163
            x82.a0 r4 = new x82.a0
            r4.<init>(r2)
            r1.f304735o = r4
        L_0x0163:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f335552h
            if (r1 != 0) goto L_0x0168
            goto L_0x016d
        L_0x0168:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager r4 = r2.f335549e
            r1.setLayoutManager(r4)
        L_0x016d:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f335552h
            if (r1 != 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            a92.b r4 = r2.f335551g
            r1.setAdapter(r4)
        L_0x0177:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f335552h
            if (r1 != 0) goto L_0x017c
            goto L_0x017f
        L_0x017c:
            r1.setItemAnimator(r3)
        L_0x017f:
            a92.e r1 = r2.f335550f
            if (r1 == 0) goto L_0x0191
            androidx.recyclerview.widget.RecyclerView r3 = r2.f335552h
            if (r3 == 0) goto L_0x018a
            r3.mo17093j1(r1)
        L_0x018a:
            androidx.recyclerview.widget.RecyclerView r3 = r2.f335552h
            if (r3 == 0) goto L_0x0191
            r3.mo17085h0(r1)
        L_0x0191:
            int r1 = r2.f335557m
            if (r1 == r11) goto L_0x01d7
            androidx.recyclerview.widget.RecyclerView r3 = r2.f335552h
            if (r3 == 0) goto L_0x01d7
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r1)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI"
            java.lang.String r15 = "applyClickEvent"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "smoothScrollToPosition"
            java.lang.String r19 = "(I)V"
            r12 = r3
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r4.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo17149t1(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI"
            java.lang.String r14 = "applyClickEvent"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "smoothScrollToPosition"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x01d7:
            x82.a r1 = r2.f335546b
            boolean r1 = r1.mo163773d()
            if (r1 == 0) goto L_0x01e3
            r2.mo163779a()
            goto L_0x01e6
        L_0x01e3:
            r2.mo163781c()
        L_0x01e6:
            x82.y r1 = r2.f335554j
            if (r1 == 0) goto L_0x01ed
            r1.mo163917d()
        L_0x01ed:
            android.widget.FrameLayout r1 = r2.f335555k
            if (r1 != 0) goto L_0x01f2
            goto L_0x01f6
        L_0x01f2:
            r2 = 4
            r1.setVisibility(r2)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112101k.mo163804h():void");
    }

    /* renamed from: j */
    public void mo163805j() {
        super.mo163805j();
        XFileSdk.finishReadFile(this.f335625M, this.f335626N);
        setMToken((String) null);
        setMFilePath((String) null);
    }

    /* renamed from: k */
    public void mo163806k() {
        setMToken((String) null);
        super.mo163806k();
    }

    /* renamed from: o */
    public void mo163807o() {
        this.f335624L = false;
        super.mo163807o();
        C112080b0 b0Var = this.f335621I;
        if (b0Var != null) {
            b0Var.mo163780b();
        }
    }

    /* renamed from: p */
    public int mo163808p() {
        int p = super.mo163808p();
        FrameLayout frameLayout = this.f335619G;
        if (frameLayout != null) {
            frameLayout.setVisibility(p);
        }
        return p;
    }

    /* renamed from: q */
    public void mo163809q(boolean z) {
        super.mo163809q(z);
        RelativeLayout relativeLayout = this.f335620H;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    public final void setMCurrentViewStatus(XFileSdk.ViewStatus viewStatus) {
        C112079b multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f335537g = viewStatus;
        }
        this.f335622J = viewStatus;
    }

    public final void setMReaderLayout(RelativeLayout relativeLayout) {
        this.f335620H = relativeLayout;
    }

    public final void setThumbUiLayout(C112080b0 b0Var) {
        this.f335621I = b0Var;
    }

    public final void setThumbnailRoot(FrameLayout frameLayout) {
        this.f335619G = frameLayout;
    }

    /* renamed from: x */
    public void mo163814x(Bundle bundle, int i) {
        if (bundle != null) {
            setVisibility(0);
            setVisibility(0);
            if (this.f335625M == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append(System.currentTimeMillis());
                setMToken(sb.toString());
            }
            setMFilePath(bundle.getString(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH));
            String string = bundle.getString(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT);
            this.f335627P = string;
            String str = this.f335626N;
            if (!(str == null || string == null)) {
                C86009m1 m1Var = new C86009m1(str);
                if (m1Var.mo119967g() && m1Var.mo119978p()) {
                    C112096g0 mScreenReportData = getMScreenReportData();
                    if (mScreenReportData != null) {
                        mScreenReportData.f335611g = this.f335627P;
                    }
                    C112096g0 mScreenReportData2 = getMScreenReportData();
                    if (mScreenReportData2 != null) {
                        mScreenReportData2.f335613i = this.f335626N;
                    }
                    C112096g0 mScreenReportData3 = getMScreenReportData();
                    if (mScreenReportData3 != null) {
                        mScreenReportData3.f335612h = C86013q1.m106451l(this.f335626N);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_SCALE, "false");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_ENABLE_RECEIVE_VIEW_STATUS_CHANGE, "true");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_BG_COLOR, String.valueOf(getResources().getColor(C0966R.color.f2949a6)));
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_FINISH_ACTIVITY, "true");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_PASSWORD, "true");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_SET_MAX_SCALE, "3");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR, "true");
                    hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, "11");
                    String str2 = this.f335626N;
                    String str3 = this.f335627P;
                    String str4 = this.f335625M;
                    XFileSdk.ViewType viewType = XFileSdk.ViewType.ReaderView;
                    Context context = getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    XFileSdk.readFile(str2, str3, str4, true, hashMap, viewType, (Activity) context, this.f335620H, new C112098i(this), new C112100j(this));
                }
            }
            mo163809q(true);
        }
    }
}
