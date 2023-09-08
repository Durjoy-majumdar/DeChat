package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.emoji.model.C93099a;
import com.tencent.p014mm.plugin.emoji.model.C93105d;
import com.tencent.p014mm.plugin.emoji.model.C93112f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import j61.C60778e;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import m61.C99793a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p441aq.C92054g;
import p490dl.C97489o;
import p490dl.C97491p;
import p595ll.C34301n;
import p595ll.C99500l;
import p595ll.C99511t;
import p645pj.C77092c;
import qn3.C101208b;
import t61.C13833l;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI */
public class EmojiCustomUI extends MMActivity implements AdapterView.OnItemClickListener, C11385n {

    /* renamed from: F */
    public static final /* synthetic */ int f268411F = 0;

    /* renamed from: A */
    public View.OnClickListener f268412A = new EmojiCustomUI$$m(this);

    /* renamed from: B */
    public final MStorage.IOnStorageChange f268413B = new EmojiCustomUI$$n(this);

    /* renamed from: C */
    public final C92668a.C92678k f268414C = new EmojiCustomUI$$o(this);

    /* renamed from: D */
    public MMHandler f268415D = new EmojiCustomUI$$p(this);

    /* renamed from: E */
    public EmojiInfo f268416E;

    /* renamed from: d */
    public EmojiCustomUI$$u f268417d = EmojiCustomUI$$u.NORMAL;

    /* renamed from: e */
    public RecyclerView f268418e;

    /* renamed from: f */
    public C99793a f268419f;

    /* renamed from: g */
    public GridLayoutManager f268420g;

    /* renamed from: h */
    public C93099a<?> f268421h;

    /* renamed from: i */
    public View f268422i;

    /* renamed from: j */
    public Button f268423j;

    /* renamed from: n */
    public Button f268424n;

    /* renamed from: o */
    public C34301n f268425o = C34301n.End;

    /* renamed from: p */
    public View f268426p;

    /* renamed from: q */
    public Button f268427q;

    /* renamed from: r */
    public ProgressDialog f268428r;

    /* renamed from: s */
    public boolean f268429s = false;

    /* renamed from: t */
    public EmojiCustomUI$$t f268430t = EmojiCustomUI$$t.EMPTY;

    /* renamed from: u */
    public ArrayList<String> f268431u = new ArrayList<>();

    /* renamed from: v */
    public int f268432v = 0;

    /* renamed from: w */
    public C99511t f268433w;

    /* renamed from: x */
    public boolean f268434x = false;

    /* renamed from: y */
    public View.OnClickListener f268435y = new EmojiCustomUI$$k(this);

    /* renamed from: z */
    public View.OnClickListener f268436z = new EmojiCustomUI$$l(this);

    /* renamed from: H7 */
    public final void mo127698H7() {
        ArrayList<String> arrayList = this.f268431u;
        if (arrayList != null) {
            arrayList.clear();
            C99793a aVar = this.f268419f;
            ArrayList<String> arrayList2 = this.f268431u;
            aVar.getClass();
            C87412m.m108594g(arrayList2, "list");
            aVar.f292472h.clear();
            aVar.f292472h.addAll(arrayList2);
        }
        Log.m105924i("MicroMsg.emoji.EmojiCustomUI", "clear md5 list. updateMode NORMAL");
    }

    /* renamed from: I7 */
    public final void mo127699I7(EmojiCustomUI$$t emojiCustomUI$$t) {
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "dz[updateButtonType,button type:%s]", emojiCustomUI$$t.toString());
        this.f268430t = emojiCustomUI$$t;
        int ordinal = emojiCustomUI$$t.ordinal();
        if (ordinal == 0) {
            this.f268427q.setVisibility(0);
            this.f268427q.setText(C0966R.string.c_k);
        } else if (ordinal == 1) {
            this.f268427q.setVisibility(0);
            this.f268427q.setText(C0966R.string.c_l);
        } else if (ordinal == 2) {
            this.f268427q.setVisibility(4);
        }
    }

    /* renamed from: J7 */
    public void mo127700J7() {
        if (this.f268417d == EmojiCustomUI$$u.EDIT) {
            ArrayList<String> arrayList = this.f268431u;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size > 0) {
                this.f268423j.setText(getResources().getString(C0966R.string.f7944x1));
                this.f268423j.setEnabled(true);
                this.f268424n.setEnabled(true);
            } else {
                this.f268423j.setText(getResources().getString(C0966R.string.f7944x1));
                this.f268423j.setEnabled(false);
                this.f268424n.setEnabled(false);
            }
            setMMTitle(getResources().getString(C0966R.string.c7m, new Object[]{Integer.valueOf(size)}));
        }
    }

    /* renamed from: K7 */
    public void mo127701K7() {
        View view = this.f268422i;
        int i = this.f268417d == EmojiCustomUI$$u.EDIT ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: L7 */
    public final void mo127702L7(EmojiCustomUI$$u emojiCustomUI$$u) {
        int i;
        MMHandler mMHandler;
        EmojiCustomUI$$u emojiCustomUI$$u2 = emojiCustomUI$$u;
        long currentTimeMillis = System.currentTimeMillis();
        this.f268417d = emojiCustomUI$$u2;
        C99793a aVar = this.f268419f;
        aVar.getClass();
        C87412m.m108594g(emojiCustomUI$$u2, "<set-?>");
        aVar.f292471g = emojiCustomUI$$u2;
        int ordinal = emojiCustomUI$$u.ordinal();
        if (ordinal == 0) {
            setBackBtn(new EmojiCustomUI$$g(this));
            enableBackMenu(true);
            addTextOptionMenu(0, getString(C0966R.string.c8_), new EmojiCustomUI$$h(this));
            View view = this.f268422i;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!NetStatusUtil.isConnected((Context) this) && (mMHandler = this.f268415D) != null) {
                mMHandler.sendEmptyMessageDelayed(1003, (long) 0);
            }
            mo127698H7();
            mo127701K7();
        } else if (ordinal == 1) {
            setBackBtn(new EmojiCustomUI$$i(this));
            addTextOptionMenu(0, getString(C0966R.string.f8014z_), new EmojiCustomUI$$j(this));
            View view3 = this.f268422i;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MMHandler mMHandler2 = this.f268415D;
            if (mMHandler2 != null) {
                mMHandler2.sendEmptyMessageDelayed(1003, (long) 0);
            }
            mo127700J7();
            mo127701K7();
        } else if (ordinal == 2) {
            mo127701K7();
        } else if (ordinal == 3) {
            mo127701K7();
        }
        this.f268419f.notifyDataSetChanged();
        if (this.f268417d == EmojiCustomUI$$u.EDIT) {
            i = 1;
            this.f268421h.mo127602f(true);
            this.f268421h.mo137253c();
            ArrayList<String> arrayList = this.f268431u;
            setMMTitle(getString(C0966R.string.c7m, new Object[]{Integer.valueOf(arrayList == null ? 0 : arrayList.size())}));
        } else {
            i = 1;
            this.f268421h.mo127602f(true);
            this.f268421h.mo137253c();
        }
        Object[] objArr = new Object[i];
        objArr[0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        Log.m105919d("MicroMsg.emoji.EmojiCustomUI", "updateMode use time:%d", objArr);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a1f;
    }

    public void initView() {
        this.f268426p = findViewById(C0966R.C0970id.kbh);
        TextView textView = (TextView) findViewById(C0966R.C0970id.kbg);
        Button button = (Button) findViewById(C0966R.C0970id.kbe);
        this.f268427q = button;
        button.setOnClickListener(this.f268435y);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.cf7);
        this.f268418e = recyclerView;
        recyclerView.setFocusable(false);
        this.f268418e.setItemAnimator((RecyclerView.C16616j) null);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 5);
        this.f268420g = gridLayoutManager;
        gridLayoutManager.f44666B = new EmojiCustomUI$$q(this);
        this.f268418e.setLayoutManager(this.f268420g);
        Drawable drawable = getDrawable(C0966R.C0969drawable.emoji_custom_divider);
        this.f268418e.mo17085h0(new C13833l(drawable, drawable, 5));
        C99793a aVar = new C99793a();
        this.f268419f = aVar;
        aVar.f289521f = new EmojiCustomUI$$r(this);
        this.f268418e.setAdapter(aVar);
        if (this.f268432v == 1) {
            this.f268421h = new C93105d();
        } else {
            this.f268421h = new C93112f(true);
        }
        this.f268421h.mo137254e(new EmojiCustomUI$$s(this, this.f268419f));
        this.f268419f.mo138125c(this.f268421h.mo127612b().mo127614a());
        this.f268422i = findViewById(C0966R.C0970id.jef);
        Button button2 = (Button) findViewById(C0966R.C0970id.jeg);
        this.f268423j = button2;
        button2.setOnClickListener(this.f268436z);
        Button button3 = (Button) findViewById(C0966R.C0970id.jeh);
        this.f268424n = button3;
        button3.setOnClickListener(this.f268412A);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105919d("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: requestCode[%d],resultCode:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            return;
        }
        if (i != 205) {
            if (i != 206) {
                Log.m105920e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: not found this requestCode");
            } else if (intent == null) {
                Log.m105920e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult MAT_IMAGE_IN_CROP_ACTIVITY return null.");
            } else {
                String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                int intExtra = intent.getIntExtra("emoji_type", 0);
                if (stringExtra != null && stringExtra.length() >= 1) {
                    String substring = stringExtra.substring(stringExtra.lastIndexOf(47) + 1);
                    ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                    this.f268416E = C30790w2.m39221h().mo57717d().mo142044TO(substring);
                    C101208b bVar = new C101208b(C101964h.m134224f() + substring);
                    bVar.f296346b = C77092c.m93040b();
                    int c = C77092c.m93041c();
                    bVar.f296347c = c;
                    bVar.f296348d = c;
                    bVar.mo140653a(new EmojiCustomUI$$f(this, intExtra, substring));
                }
            }
        } else if (intent != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("CropImageMode", 3);
            intent2.putExtra("CropImage_OutputPath", C101964h.m134224f());
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93180m(intent2, 206, this, intent);
        }
    }

    public void onBackPressed() {
        if (this.f268417d == EmojiCustomUI$$u.EDIT) {
            mo127702L7(EmojiCustomUI$$u.NORMAL);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        this.f268432v = getIntent().getIntExtra("key_emoji_panel_type", this.f268432v);
        this.f268434x = getIntent().getBooleanExtra("key_from_settings_mine", false);
        if (this.f268432v == 1) {
            this.f268433w = C92668a.f266699q.mo126717a(false);
        } else {
            this.f268433w = C92668a.f266699q.mo126718b(false);
        }
        initView();
        mo127702L7(EmojiCustomUI$$u.NORMAL);
        boolean booleanValue = this.f268432v == 1 ? ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, Boolean.TRUE)).booleanValue() : ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, Boolean.TRUE)).booleanValue();
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "[cpan] touch batch emoji download from EmojiCustomUI needDownload:%b", Boolean.valueOf(booleanValue));
        if (booleanValue) {
            new C99500l(this.f268432v, (String) null).mo138911a();
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57717d().add(this.f268413B);
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(406, 9, 1, false);
        nVar.idkeyStat(406, 11, System.currentTimeMillis() - currentTimeMillis, false);
        nVar.mo160131h(12740, 4, "", "", "", 28, 28);
        this.f268433w.mo126705f(this.f268414C);
        this.f268433w.mo126702d(true);
        C97491p.f286143a.mo136773a(true);
        if (this.f268432v == 0) {
            C30764p2 p2Var = C30764p2.f82718j;
            if (p2Var.mo57677d() && !C30777t2.f82756d.vx0()) {
                Log.m105924i("MicroMsg.emoji.EmojiCustomUI", "setupEmojiRecognition: isFromSettingsMine=" + this.f268434x);
                long j = 1;
                if (!this.f268434x) {
                    CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = new CustomEmotionRecognitionSwitchStruct();
                    customEmotionRecognitionSwitchStruct.f265380d = 2;
                    customEmotionRecognitionSwitchStruct.f265381e = 1;
                    customEmotionRecognitionSwitchStruct.f265382f = 2;
                    customEmotionRecognitionSwitchStruct.mo86054n();
                    if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, false)) {
                        C2212c1.m2042a(this, new EmojiCustomUI$$a(customEmotionRecognitionSwitchStruct), new EmojiCustomUI$$b(customEmotionRecognitionSwitchStruct));
                        return;
                    }
                    return;
                }
                View findViewById = findViewById(C0966R.C0970id.mbh);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.mbf);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById(C0966R.C0970id.mbg);
                mMSwitchBtn.setCheck(p2Var.mo57678e());
                CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct2 = new CustomEmotionRecognitionSwitchStruct();
                customEmotionRecognitionSwitchStruct2.f265380d = 1;
                customEmotionRecognitionSwitchStruct2.f265381e = 1;
                if (!p2Var.mo57678e()) {
                    j = 2;
                }
                customEmotionRecognitionSwitchStruct2.f265382f = j;
                customEmotionRecognitionSwitchStruct2.mo86054n();
                mMSwitchBtn.setSwitchListener(new EmojiCustomUI$$c(this, mMSwitchBtn, customEmotionRecognitionSwitchStruct2));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57717d().remove(this.f268413B);
        this.f268433w.mo126704e(this.f268414C);
        this.f268415D.removeCallbacksAndMessages((Object) null);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107529k().f251779b.mo123470p(698, this);
    }

    public void onResume() {
        MMHandler mMHandler;
        super.onResume();
        if (!NetStatusUtil.isConnected((Context) this) && (mMHandler = this.f268415D) != null) {
            mMHandler.sendEmptyMessageDelayed(1003, (long) 0);
        }
        C86709a0.m107529k().f251779b.mo123455a(698, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Class cls = C92054g.class;
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar2 instanceof C60778e) {
            int i3 = ((C60778e) yVar2).f173111g;
            if (i3 == 2) {
                ProgressDialog progressDialog = this.f268428r;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f268428r.dismiss();
                }
                if (i == 0 && i2 == 0) {
                    C86709a0.m107525e().postToWorker(new C29877y(this, new ArrayList(this.f268431u)));
                    if (this.f268432v == 0) {
                        C97489o.m125592g().mo136771m(true);
                        C97489o.m125592g().mo136769k(true);
                    } else {
                        C97489o.m125592g().mo136770l(true);
                    }
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    C30790w2.m39221h().mo57717d().mo142037LL(this.f268431u, this.f268432v);
                    mo127698H7();
                    mo127700J7();
                    C97491p.f286143a.mo136773a(true);
                    if (C30777t2.f82756d.wx0()) {
                        C96954m mVar = C96954m.f284033a;
                        Log.m105924i("MicroMsg.EmojiOcrService", "restart");
                        mVar.mo135540d();
                        mVar.mo135539c(false);
                        return;
                    }
                    C30764p2 p2Var = C30764p2.f82718j;
                    if (p2Var.mo57678e()) {
                        p2Var.mo57680g();
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.emoji.EmojiCustomUI", "delete failed");
                C76879j.m92707A(getContext(), getString(C0966R.string.c_w), "", "", getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (i3 == 3) {
                ProgressDialog progressDialog2 = this.f268428r;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f268428r.dismiss();
                }
                if (i == 0 && i2 == 0) {
                    if (this.f268432v == 0) {
                        C97489o.m125592g().mo136771m(true);
                        C97489o.m125592g().mo136769k(true);
                    } else {
                        C97489o.m125592g().mo136770l(true);
                    }
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    C30790w2.m39221h().mo57717d().c40(this.f268432v, this.f268431u);
                    mo127698H7();
                    mo127700J7();
                    this.f268419f.notifyDataSetChanged();
                    return;
                }
                C76879j.m92707A(getContext(), getString(C0966R.string.c_w), "", "", getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            }
        } else {
            Log.m105928w("MicroMsg.emoji.EmojiCustomUI", "no emoji operate");
        }
    }
}
