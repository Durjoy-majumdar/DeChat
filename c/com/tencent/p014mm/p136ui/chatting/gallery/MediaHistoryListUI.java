package com.tencent.p014mm.p136ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.presenter.C73778a;
import com.tencent.p014mm.p136ui.chatting.presenter.C73787b;
import com.tencent.p014mm.p136ui.chatting.presenter.C73797e;
import com.tencent.p014mm.p136ui.chatting.presenter.C73798f;
import com.tencent.p014mm.p136ui.chatting.presenter.C73808p;
import com.tencent.p014mm.p136ui.chatting.presenter.C73816q;
import com.tencent.p014mm.p136ui.chatting.presenter.C73822r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import dk3.C75413e;
import dk3.C75414f;
import eb0.C97625j3;
import kv1.C99254i;
import nj3.C88989a;
import p385u2.C111105a;
import p716uu.C52617d;
import qo3.C89779i0;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI */
public class MediaHistoryListUI extends MMActivity implements C75414f {

    /* renamed from: d */
    public C75413e f216404d;

    /* renamed from: e */
    public String f216405e;

    /* renamed from: f */
    public TextView f216406f;

    /* renamed from: g */
    public RecyclerView f216407g;

    /* renamed from: h */
    public ProgressDialog f216408h;

    /* renamed from: i */
    public C114760b f216409i;

    /* renamed from: j */
    public boolean f216410j = false;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI$a */
    public class C73702a implements Runnable {
        public C73702a() {
        }

        public void run() {
            MediaHistoryListUI.this.f216409i.mo153849a();
        }
    }

    /* renamed from: H7 */
    public final void mo102765H7(boolean z) {
        Log.m105925i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            this.f216408h = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f216408h;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f216408h.dismiss();
            this.f216408h = null;
        }
    }

    /* renamed from: f */
    public void mo102729f(boolean z) {
        mo102765H7(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbe;
    }

    public void initView() {
        this.f216410j = getIntent().getBooleanExtra("detail_user_dismiss", false);
        C114760b bVar = new C114760b();
        this.f216409i = bVar;
        bVar.mo153851c(false);
        C114760b bVar2 = this.f216409i;
        C52617d.C52618a d = this.f216404d.mo102840d();
        bVar2.f344100u = d;
        bVar2.f319122j = d;
        this.f216409i.f344097r = false;
        this.f216406f = (TextView) findViewById(C0966R.C0970id.j6m);
        this.f216407g = (RecyclerView) findViewById(C0966R.C0970id.ewn);
        findViewById(C0966R.C0970id.bru).setBackgroundColor(getResources().getColor(C0966R.color.f2929c));
        this.f216407g.setBackgroundColor(getResources().getColor(C0966R.color.f2929c));
        this.f216407g.setLayoutManager(this.f216404d.mo102839b(this));
        this.f216407g.mo17085h0(this.f216404d.mo102838a(this));
        this.f216407g.setAdapter(this.f216404d.mo102841h(this.f216405e));
        this.f216407g.setHasFixedSize(true);
        setMMTitle(this.f216404d.mo102824c());
    }

    /* renamed from: k */
    public void mo102730k(boolean z, int i) {
        mo102765H7(false);
        Log.m105925i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", Boolean.valueOf(z), Integer.valueOf(i));
        if (i <= 0) {
            this.f216406f.setVisibility(0);
            this.f216407g.setVisibility(8);
            this.f216406f.setText(getString(C0966R.string.bav));
            return;
        }
        this.f216406f.setVisibility(8);
        this.f216407g.setVisibility(0);
        this.f216407g.getAdapter().notifyDataSetChanged();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        int i = 1;
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f216405e = getIntent().getStringExtra("kintent_talker");
        int intExtra = getIntent().getIntExtra("key_media_type", -1);
        int i2 = 2;
        C73787b aVar = intExtra != 2 ? intExtra != 3 ? intExtra != 4 ? intExtra != 5 ? intExtra != 6 ? null : new C73778a(this) : new C73816q(this) : new C73808p(this) : new C73822r(this) : new C73798f(this);
        if (aVar == null) {
            Log.m105920e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
            return;
        }
        aVar.f216569f = this;
        mo82061t5(aVar);
        setActionbarColor(C111105a.m151500b(getContext(), C0966R.color.a7_));
        hideActionbarLine();
        initView();
        this.f216404d.mo102827g(true);
        boolean U5 = C72996z1.m85820U5(this.f216405e);
        C44661m1 SE = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69801SE(this.f216405e);
        if (U5) {
            if (this.f216404d.getType() == 6) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = 0;
                objArr[4] = 1;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = Integer.valueOf(SE.mo69790r2().size());
                if (this.f216410j) {
                    i = 2;
                }
                objArr[8] = Integer.valueOf(i);
                nVar.mo160131h(14569, objArr);
            } else if (this.f216404d.getType() == -1) {
                C115669n nVar2 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[9];
                objArr2[0] = 0;
                objArr2[1] = 0;
                objArr2[2] = 0;
                objArr2[3] = 0;
                objArr2[4] = 0;
                objArr2[5] = 1;
                objArr2[6] = 0;
                objArr2[7] = Integer.valueOf(SE.mo69790r2().size());
                if (this.f216410j) {
                    i = 2;
                }
                objArr2[8] = Integer.valueOf(i);
                nVar2.mo160131h(14569, objArr2);
            } else if (this.f216404d.getType() == 3) {
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr3 = new Object[9];
                objArr3[0] = 0;
                objArr3[1] = 0;
                objArr3[2] = 0;
                objArr3[3] = 0;
                objArr3[4] = 0;
                objArr3[5] = 0;
                objArr3[6] = 1;
                objArr3[7] = Integer.valueOf(SE.mo69790r2().size());
                if (this.f216410j) {
                    i = 2;
                }
                objArr3[8] = Integer.valueOf(i);
                nVar3.mo160131h(14569, objArr3);
            } else if (this.f216404d.getType() == 5) {
                C115669n nVar4 = C115669n.INSTANCE;
                Object[] objArr4 = new Object[10];
                objArr4[0] = 0;
                objArr4[1] = 0;
                objArr4[2] = 0;
                objArr4[3] = 0;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = Integer.valueOf(SE.mo69790r2().size());
                if (this.f216410j) {
                    i = 2;
                }
                objArr4[8] = Integer.valueOf(i);
                objArr4[9] = 1;
                nVar4.mo160131h(14569, objArr4);
            } else if (this.f216404d.getType() == 33) {
                C115669n nVar5 = C115669n.INSTANCE;
                Object[] objArr5 = new Object[11];
                objArr5[0] = 0;
                objArr5[1] = 0;
                objArr5[2] = 0;
                objArr5[3] = 0;
                objArr5[4] = 0;
                objArr5[5] = 0;
                objArr5[6] = 0;
                objArr5[7] = Integer.valueOf(SE.mo69790r2().size());
                if (this.f216410j) {
                    i = 2;
                }
                objArr5[8] = Integer.valueOf(i);
                objArr5[9] = 0;
                objArr5[10] = 8;
                nVar5.mo160131h(14569, objArr5);
            }
        } else if (this.f216404d.getType() == 6) {
            C115669n nVar6 = C115669n.INSTANCE;
            Object[] objArr6 = new Object[9];
            objArr6[0] = 0;
            objArr6[1] = 0;
            objArr6[2] = 0;
            objArr6[3] = 0;
            objArr6[4] = 1;
            objArr6[5] = 0;
            objArr6[6] = 0;
            objArr6[7] = 0;
            if (!this.f216410j) {
                i2 = 0;
            }
            objArr6[8] = Integer.valueOf(i2);
            nVar6.mo160131h(14569, objArr6);
        } else if (this.f216404d.getType() == -1) {
            C115669n nVar7 = C115669n.INSTANCE;
            Object[] objArr7 = new Object[9];
            objArr7[0] = 0;
            objArr7[1] = 0;
            objArr7[2] = 0;
            objArr7[3] = 0;
            objArr7[4] = 0;
            objArr7[5] = 1;
            objArr7[6] = 0;
            objArr7[7] = 0;
            if (!this.f216410j) {
                i2 = 0;
            }
            objArr7[8] = Integer.valueOf(i2);
            nVar7.mo160131h(14569, objArr7);
        } else if (this.f216404d.getType() == 3) {
            C115669n nVar8 = C115669n.INSTANCE;
            Object[] objArr8 = new Object[9];
            objArr8[0] = 0;
            objArr8[1] = 0;
            objArr8[2] = 0;
            objArr8[3] = 0;
            objArr8[4] = 0;
            objArr8[5] = 0;
            objArr8[6] = 1;
            objArr8[7] = 0;
            if (!this.f216410j) {
                i2 = 0;
            }
            objArr8[8] = Integer.valueOf(i2);
            nVar8.mo160131h(14569, objArr8);
        } else if (this.f216404d.getType() == 5) {
            C115669n nVar9 = C115669n.INSTANCE;
            Object[] objArr9 = new Object[10];
            objArr9[0] = 0;
            objArr9[1] = 0;
            objArr9[2] = 0;
            objArr9[3] = 0;
            objArr9[4] = 0;
            objArr9[5] = 0;
            objArr9[6] = 0;
            objArr9[7] = 0;
            if (!this.f216410j) {
                i2 = 0;
            }
            objArr9[8] = Integer.valueOf(i2);
            objArr9[9] = 1;
            nVar9.mo160131h(14569, objArr9);
        } else if (this.f216404d.getType() == 33) {
            C115669n nVar10 = C115669n.INSTANCE;
            Object[] objArr10 = new Object[11];
            objArr10[0] = 0;
            objArr10[1] = 0;
            objArr10[2] = 0;
            objArr10[3] = 0;
            objArr10[4] = 0;
            objArr10[5] = 0;
            objArr10[6] = 0;
            objArr10[7] = 0;
            if (!this.f216410j) {
                i2 = 0;
            }
            objArr10[8] = Integer.valueOf(i2);
            objArr10[9] = 0;
            objArr10[10] = 8;
            nVar10.mo160131h(14569, objArr10);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C114760b bVar = this.f216409i;
        if (bVar == null) {
            return false;
        }
        bVar.mo23882j(this, menu);
        C114760b bVar2 = this.f216409i;
        String e = this.f216404d.mo102825e();
        if (bVar2.f319121i != null && !Util.isNullOrNil(e)) {
            bVar2.f319121i.setSelectedTag(e);
        }
        getContentView().postDelayed(new C73702a(), 200);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f216404d.onDetach();
    }

    public void onFinish() {
        Log.m105924i("MicroMsg.MediaHistoryListUI", "[onRefreshed]");
        finish();
        overridePendingTransition(0, 0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        if (keyboardState() == 2) {
            this.f216409i.mo153849a();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f216409i.mo153858m(this, menu);
        return true;
    }

    /* renamed from: t2 */
    public void mo102732t2(String str, boolean z) {
        if (z) {
            String string = getString(C0966R.string.baz, new Object[]{str});
            this.f216406f.setVisibility(0);
            this.f216407g.setVisibility(8);
            TextView textView = this.f216406f;
            textView.setText(C99254i.m129306c(textView.getContext(), string, str));
            return;
        }
        this.f216406f.setVisibility(8);
        this.f216407g.setVisibility(0);
    }

    /* renamed from: t5 */
    public void mo82061t5(C73797e eVar) {
        this.f216404d = (C75413e) eVar;
    }
}
