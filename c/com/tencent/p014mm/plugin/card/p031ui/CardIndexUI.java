package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import hz0.C46142c0;
import hz0.C46153l0;
import hz0.C46154m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l20.C21388a;
import ob0.C117747y;
import p327ct.C30914c;
import te3.C48885bo;
import te3.C52186yy3;
import te3.C52327zy3;

/* renamed from: com.tencent.mm.plugin.card.ui.CardIndexUI */
public class CardIndexUI extends CardBaseUI {

    /* renamed from: A */
    public ImageView f109780A;

    /* renamed from: B */
    public LinearLayout f109781B;

    /* renamed from: C */
    public long f109782C = 0;

    /* renamed from: D */
    public int f109783D = -1;

    /* renamed from: w */
    public View f109784w;

    /* renamed from: x */
    public TextView f109785x;

    /* renamed from: y */
    public TextView f109786y;

    /* renamed from: z */
    public TextView f109787z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardIndexUI$a */
    public class C2158a implements View.OnClickListener {
        public C2158a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardIndexUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CardIndexUI.this.getClass();
            throw null;
        }
    }

    /* renamed from: H7 */
    public BaseAdapter mo63746H7() {
        return 3 == this.f109783D ? new C40865j0(this, mo63747I7()) : new C40859c(this, mo63747I7());
    }

    /* renamed from: I7 */
    public C46154m mo63747I7() {
        int i = this.f109783D;
        return 1 == i ? C46154m.MEMBER_CARD_TYPE : 3 == i ? ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue() ? C46154m.GENERAL_WITHOUT_INVOICE_TYPE : C46154m.GENERAL_TYPE : C46154m.NORMAL_TYPE;
    }

    /* renamed from: J7 */
    public void mo63748J7() {
        int i = this.f109783D;
        if (1 == i) {
            setMMTitle((int) C0966R.string.azo);
        } else if (3 == i) {
            setMMTitle((int) C0966R.string.b26);
        } else {
            setMMTitle((int) C0966R.string.azy);
        }
        this.f109786y = (TextView) findViewById(C0966R.C0970id.hga);
        this.f109787z = (TextView) findViewById(C0966R.C0970id.hgb);
        this.f109780A = (ImageView) findViewById(C0966R.C0970id.hg9);
        this.f109784w = findViewById(C0966R.C0970id.au7);
        this.f109785x = (TextView) findViewById(C0966R.C0970id.au8);
        this.f109781B = (LinearLayout) findViewById(C0966R.C0970id.hg_);
        View view = this.f109784w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f109787z.setVisibility(0);
        this.f109786y.setVisibility(0);
        this.f109780A.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f109781B.getLayoutParams();
        layoutParams.topMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 100.0f);
        this.f109781B.setLayoutParams(layoutParams);
        int i2 = this.f109783D;
        if (1 == i2) {
            this.f109787z.setText(getString(C0966R.string.azb));
            this.f109786y.setText(getString(C0966R.string.aza));
        } else if (3 == i2) {
            this.f109787z.setText(getString(C0966R.string.azi));
            this.f109786y.setText(getString(C0966R.string.azh));
        } else {
            this.f109787z.setText(getString(C0966R.string.b0i));
            this.f109786y.setText(getString(C0966R.string.b0x));
        }
        if (this.f109783D == 3) {
            this.f109699d.setEmptyView((View) null);
            this.f109701f.setVisibility(8);
        }
        this.f109785x.setOnClickListener(new C2158a());
        if (this.f109783D == 3 && ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
            Log.m105924i("MicroMsg.CardIndexUI", "has load new entrance");
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_SECOND_ENTRANCE_STRING_SYNC, (Object) null);
            if (!Util.isNullOrNil(str)) {
                try {
                    C52327zy3 zy32 = new C52327zy3();
                    zy32.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                    mo63785Y7(zy32.f146284d);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.CardIndexUI", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: Y7 */
    public final void mo63785Y7(List<C52186yy3> list) {
        if (list != null && !list.isEmpty()) {
            for (C52186yy3 next : list) {
                if (next.f145579d == 1) {
                    Log.m105924i("MicroMsg.CardIndexUI", "should update new invoice");
                    LinkedList<C48885bo> linkedList = next.f145580e;
                    this.f109703h.removeAllViews();
                    this.f109703h.setPadding(0, 0, 0, 0);
                    if (linkedList != null && !linkedList.isEmpty()) {
                        int i = 0;
                        for (C48885bo next2 : linkedList) {
                            View inflate = View.inflate(getContext(), C0966R.C0971layout.f6747nf, (ViewGroup) null);
                            ((CdnImageView) inflate.findViewById(C0966R.C0970id.f357716be1)).setUrl(next2.f131229e);
                            ((TextView) inflate.findViewById(C0966R.C0970id.f357718be3)).setText(next2.f131228d);
                            ((TextView) inflate.findViewById(C0966R.C0970id.f357715be0)).setText(next2.f131230f);
                            if (next2.f131231g > 0) {
                                inflate.setOnClickListener(new C40872v(this, next2));
                            }
                            this.f109703h.addView(inflate);
                            if (i == 0) {
                                this.f109703h.setPadding(0, C76577a.m92151b(this, 13), 0, 0);
                            } else {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.topMargin = C76577a.m92151b(this, 6);
                                    inflate.setLayoutParams(layoutParams);
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (this.f109703h.getChildCount() == 0 && this.f109700e.getCount() == 0) {
            Log.m105924i("MicroMsg.CardIndexUI", "show empty view");
            this.f109701f.setVisibility(0);
            this.f109699d.setVisibility(8);
            return;
        }
        Log.m105924i("MicroMsg.CardIndexUI", "hide empty view");
        this.f109701f.setVisibility(8);
        this.f109699d.setVisibility(0);
    }

    public void initView() {
        if (getIntent() != null) {
            this.f109783D = getIntent().getIntExtra("key_card_type", -1);
        }
        super.initView();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.CardIndexUI", "oncreate");
        this.f109782C = System.currentTimeMillis();
        initView();
        C86709a0.m107529k().f251779b.mo123455a(1054, this);
        C46153l0.vx0().mo58722a(1);
        int i = C46153l0.Bx0().f124034c;
        if (((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33497e(262152, 266256) || i > 0) {
            C115669n.INSTANCE.mo160131h(11324, "CardPackageListView", 0, "", "", 1, 0, "", 0, "");
            return;
        }
        C115669n.INSTANCE.mo160131h(11324, "CardPackageListView", 0, "", "", 0, 0, "", 0, "");
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(1054, this);
        long currentTimeMillis = System.currentTimeMillis() - this.f109782C;
        C115669n.INSTANCE.mo160131h(13219, "CardPackageListView", 0, "", "", Long.valueOf(currentTimeMillis));
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C52327zy3 zy32;
        super.onSceneEnd(i, i2, str, yVar);
        if (i == 0 && i2 == 0 && (yVar instanceof C46142c0)) {
            C46142c0 c0Var = (C46142c0) yVar;
            if (c0Var.f124347f) {
                BaseAdapter baseAdapter = this.f109700e;
                if (baseAdapter instanceof C40859c) {
                    ((C40859c) baseAdapter).mo7997q(false);
                    ((C40859c) this.f109700e).mo7997q(true);
                    ((C40859c) this.f109700e).mo1333o();
                }
            }
            if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue() && (zy32 = c0Var.f124349h) != null) {
                mo63785Y7(zy32.f146284d);
                BaseAdapter baseAdapter2 = this.f109700e;
                if (baseAdapter2 instanceof C40859c) {
                    ((C40859c) baseAdapter2).mo7997q(false);
                    ((C40859c) this.f109700e).mo7997q(true);
                    ((C40859c) this.f109700e).mo1333o();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
    }
}
