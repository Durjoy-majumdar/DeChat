package t82;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq3.C106958d;
import gy3.C87412m;
import h90.C98324b;
import lh2.C109344g0;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p248ug.C111164r0;
import p248ug.C111167t;
import p520fi.C107546c;
import qh2.C101198e;
import th2.C110992d;
import x82.C112075a;
import x82.C112095g;
import zp3.C112659d0;

/* renamed from: t82.f */
public final class C110952f extends BasePluginLayout implements C101198e {

    /* renamed from: h */
    public C112075a f331859h;

    /* renamed from: i */
    public C112095g f331860i;

    /* renamed from: j */
    public RecordConfigProvider f331861j;

    /* renamed from: n */
    public final C110953g f331862n;

    /* renamed from: o */
    public final C110949e f331863o;

    /* renamed from: p */
    public View f331864p;

    /* renamed from: q */
    public Bitmap f331865q;

    /* renamed from: r */
    public int f331866r;

    /* renamed from: s */
    public int f331867s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110952f(Context context, C112075a aVar, C112095g gVar) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f331859h = aVar;
        this.f331860i = gVar;
        this.f331864p = View.inflate(context, C0966R.C0971layout.bup, this);
        C110953g gVar2 = new C110953g(this, this);
        this.f331862n = gVar2;
        View findViewById = findViewById(C0966R.C0970id.f359123j30);
        C87412m.m108593f(findViewById, "findViewById(R.id.screen_preview_plugin)");
        C110949e eVar = new C110949e((FrameLayout) findViewById, this, this.f331860i);
        this.f331863o = eVar;
        getPluginList().add(gVar2);
        getPluginList().add(eVar);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        super.mo78564e();
        return true;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final Bitmap getBitmap() {
        return this.f331865q;
    }

    public final C112095g getConfig() {
        return this.f331860i;
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f331861j;
    }

    public final int getMHeight() {
        return this.f331867s;
    }

    public final int getMWidth() {
        return this.f331866r;
    }

    public final C110949e getMultiTalkEditPhotoWrapper() {
        return this.f331863o;
    }

    public final C112075a getStatusManager() {
        return this.f331859h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r5, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r6) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "configProvider"
            gy3.C87412m.m108594g(r6, r0)
            super.mo128671k(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "configProvider "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "MicroMsg.MultiTalkScreenEditContainerPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            r4.f331861j = r6
            hi2.h r5 = hi2.C98453h.f288774a
            r5.mo137805c(r6)
            java.util.ArrayList r5 = r4.getPluginList()
            java.util.Iterator r5 = r5.iterator()
        L_0x0032:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r5.next()
            lh2.g0 r0 = (lh2.C109344g0) r0
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r6.f272927o
            r2 = 0
            if (r1 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r1.f266575h
            if (r1 == 0) goto L_0x005a
            java.lang.String r3 = r0.name()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x005a
            boolean r1 = r1.booleanValue()
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = 8
        L_0x0062:
            r0.setVisibility(r2)
            goto L_0x0032
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t82.C110952f.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        super.mo129855l(bVar);
        if (bVar != null && bVar.f288194o != null) {
            this.f331863o.mo162630a(false, bVar);
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        IEmojiInfo iEmojiInfo;
        C101198e.C101199b bVar2 = bVar;
        Bundle bundle2 = bundle;
        C111167t tVar = C111167t.MOSAIC;
        C111167t tVar2 = C111167t.TEXT;
        C87412m.m108594g(bVar2, "status");
        Log.m105924i("MicroMsg.MultiTalkScreenEditContainerPlugin", "status :" + bVar2 + " , param :" + bundle2);
        int ordinal = bVar.ordinal();
        if (ordinal != 29) {
            String str = null;
            if (ordinal != 37) {
                if (ordinal == 39) {
                    return;
                }
                if (ordinal != 42) {
                    if (ordinal == 62) {
                        C110949e eVar = this.f331863o;
                        if (!eVar.f331851p) {
                            Context context = eVar.f331850o;
                            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                            if (!((Activity) context).isFinishing()) {
                                eVar.f331851p = true;
                                C111164r0 r0Var = eVar.f331847i;
                                if (r0Var != null) {
                                    r0Var.mo162898g(new C110945a(eVar));
                                }
                            }
                        }
                    } else if (ordinal != 104) {
                        if (ordinal == 68) {
                            C109623f fVar = this.f331863o.f331849n;
                            if (fVar != null) {
                                new C109610a((C109612c) fVar).mo150361a(C111167t.EMOJI);
                            }
                        } else if (ordinal != 69) {
                            switch (ordinal) {
                                case 74:
                                    this.f331863o.reset();
                                    return;
                                case 75:
                                    C110949e eVar2 = this.f331863o;
                                    eVar2.f331855t = tVar;
                                    eVar2.f331856u = 0;
                                    C109623f fVar2 = eVar2.f331849n;
                                    if (fVar2 != null) {
                                        new C109610a((C109612c) fVar2).mo150361a(tVar);
                                    }
                                    C109623f fVar3 = eVar2.f331849n;
                                    if (fVar3 != null) {
                                        new C109610a((C109612c) fVar3).mo150363c(tVar, 0, (Object) null);
                                    }
                                    C110992d dVar = C110992d.f332425a;
                                    C110992d.m151314c(dVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, (Object) null);
                                    dVar.mo162669b(8);
                                    return;
                                case 76:
                                    C110949e eVar3 = this.f331863o;
                                    eVar3.f331855t = tVar;
                                    eVar3.f331856u = 1;
                                    C109623f fVar4 = eVar3.f331849n;
                                    if (fVar4 != null) {
                                        new C109610a((C109612c) fVar4).mo150361a(tVar);
                                    }
                                    C109623f fVar5 = eVar3.f331849n;
                                    if (fVar5 != null) {
                                        new C109610a((C109612c) fVar5).mo150363c(tVar, 1, (Object) null);
                                    }
                                    C110992d dVar2 = C110992d.f332425a;
                                    C110992d.m151314c(dVar2, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, (Object) null);
                                    dVar2.mo162669b(9);
                                    return;
                                case 77:
                                    if (bundle2 != null) {
                                        C110949e eVar4 = this.f331863o;
                                        int i = bundle2.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT");
                                        C111167t tVar3 = C111167t.DOODLE;
                                        eVar4.f331855t = tVar3;
                                        eVar4.f331856u = i;
                                        C109623f fVar6 = eVar4.f331849n;
                                        if (fVar6 != null) {
                                            new C109610a((C109612c) fVar6).mo150361a(tVar3);
                                        }
                                        C109623f fVar7 = eVar4.f331849n;
                                        if (fVar7 != null) {
                                            new C109610a((C109612c) fVar7).mo150363c(tVar3, i, (Object) null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 78:
                                    C110949e eVar5 = this.f331863o;
                                    C109623f fVar8 = eVar5.f331849n;
                                    if (fVar8 != null) {
                                        new C109610a((C109612c) fVar8).mo150363c(C107546c.f321771c.mo157986a(), -1, (Object) null);
                                    }
                                    C109623f fVar9 = eVar5.f331849n;
                                    if (fVar9 != null) {
                                        new C109610a((C109612c) fVar9).mo150361a(eVar5.f331855t);
                                    }
                                    C109623f fVar10 = eVar5.f331849n;
                                    if (fVar10 != null) {
                                        new C109610a((C109612c) fVar10).mo150363c(eVar5.f331855t, eVar5.f331856u, (Object) null);
                                        return;
                                    }
                                    return;
                                case 79:
                                    C112075a.C112076a.m152803a(this.f331859h, C112075a.C112077b.HIDE_DOODLE_LAYOUT, (Bundle) null, 2, (Object) null);
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            C109623f fVar11 = this.f331863o.f331849n;
                            if (fVar11 != null) {
                                new C109610a((C109612c) fVar11).mo150361a(tVar2);
                            }
                        }
                    } else if (bundle2 != null && (iEmojiInfo = (IEmojiInfo) bundle2.getParcelable("PARAM_EDIT_EMOJI_INFO")) != null) {
                        C110949e eVar6 = this.f331863o;
                        eVar6.getClass();
                        C109623f fVar12 = eVar6.f331849n;
                        if (fVar12 != null) {
                            new C109610a((C109612c) fVar12).mo150361a(tVar2);
                        }
                        C109623f fVar13 = eVar6.f331849n;
                        if (fVar13 != null) {
                            ((C109612c) fVar13).mo160830n(iEmojiInfo);
                        }
                    }
                } else if (bundle2 != null) {
                    bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                    bundle2.getInt("PARAM_EDIT_TEXT_COLOR");
                    bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                }
            } else if (bundle2 != null) {
                CharSequence charSequence = bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i2 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR");
                int i3 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                C110949e eVar7 = this.f331863o;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                String str2 = str;
                C109623f fVar14 = eVar7.f331849n;
                if (fVar14 != null) {
                    new C109610a((C109612c) fVar14).mo150361a(tVar2);
                }
                C109623f fVar15 = eVar7.f331849n;
                if (fVar15 != null) {
                    ((C109612c) fVar15).mo160831o(str2, i2, i3, "", false, 0.0f, true, true, 0);
                }
            }
        } else {
            super.mo78564e();
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        this.f331865q = bitmap;
    }

    public final void setConfig(C112095g gVar) {
        this.f331860i = gVar;
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f331861j = recordConfigProvider;
    }

    public final void setDrawingEnable(boolean z) {
        C106958d dVar;
        C112659d0 d0Var = this.f331863o.f331848j;
        if (d0Var != null && (dVar = (C106958d) d0Var.getBaseBoardView()) != null) {
            dVar.setTouchEnable(z);
        }
    }

    public final void setMHeight(int i) {
        this.f331867s = i;
    }

    public final void setMWidth(int i) {
        this.f331866r = i;
    }

    public final void setStatusManager(C112075a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f331859h = aVar;
    }
}
