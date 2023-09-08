package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.plugin.emoji.model.C93106d0;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.GridInScrollView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import i61.C98601f;
import ic0.C98661k;
import ie3.C76324c;
import j20.C117292a;
import j61.C33523r;
import j61.C46436d;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p275xz.C15919f;
import p441aq.C92054g;
import p910lj.C76701a;
import pe3.C47465a;
import te3.C50094k80;
import te3.C50228l80;
import te3.C50790p7;
import te3.C51759vz1;
import u61.C101964h;
import wh3.C38142q;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI */
public class EmojiStoreV2RewardUI extends MMActivity implements AdapterView.OnItemClickListener, C11385n, C68866c0 {

    /* renamed from: G */
    public static final /* synthetic */ int f268844G = 0;

    /* renamed from: A */
    public boolean f268845A = false;

    /* renamed from: B */
    public MMHandler f268846B = new C93230a();

    /* renamed from: C */
    public View.OnClickListener f268847C = new C93231b();

    /* renamed from: D */
    public View.OnClickListener f268848D = new C93232c();

    /* renamed from: E */
    public TextWatcher f268849E = new C93233d();

    /* renamed from: F */
    public C93106d0 f268850F = new C93106d0(new C93234e());

    /* renamed from: d */
    public String f268851d;

    /* renamed from: e */
    public String f268852e;

    /* renamed from: f */
    public int f268853f;

    /* renamed from: g */
    public int f268854g;

    /* renamed from: h */
    public C51759vz1 f268855h;

    /* renamed from: i */
    public EmojiStoreV2RewardBannerView f268856i;

    /* renamed from: j */
    public AnimationDrawable f268857j;

    /* renamed from: n */
    public GridInScrollView f268858n;

    /* renamed from: o */
    public ProgressDialog f268859o;

    /* renamed from: p */
    public View f268860p;

    /* renamed from: q */
    public View f268861q;

    /* renamed from: r */
    public MMFormInputView f268862r;

    /* renamed from: s */
    public Button f268863s;

    /* renamed from: t */
    public TextView f268864t;

    /* renamed from: u */
    public TextView f268865u;

    /* renamed from: v */
    public C93240k f268866v;

    /* renamed from: w */
    public C46436d f268867w;

    /* renamed from: x */
    public String f268868x;

    /* renamed from: y */
    public String f268869y;

    /* renamed from: z */
    public C93239j f268870z = C93239j.NORMAL;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$a */
    public class C93230a extends MMHandler {
        public C93230a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1001) {
                String str = (String) message.obj;
                if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
                    Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardUI", "path is null or file no exists");
                    return;
                }
                EmojiStoreV2RewardUI.this.f268856i.setImageFilePath(str);
                EmojiStoreV2RewardUI.this.f268856i.setScaleType(ImageView.ScaleType.FIT_XY);
                AnimationDrawable animationDrawable = EmojiStoreV2RewardUI.this.f268857j;
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    EmojiStoreV2RewardUI.this.f268857j.stop();
                }
            } else if (i == 1002) {
                EmojiStoreV2RewardUI emojiStoreV2RewardUI = EmojiStoreV2RewardUI.this;
                int i2 = EmojiStoreV2RewardUI.f268844G;
                emojiStoreV2RewardUI.mo127841M7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$b */
    public class C93231b implements View.OnClickListener {
        public C93231b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C93240k kVar = EmojiStoreV2RewardUI.this.f268866v;
            if (kVar != null) {
                C50094k80 a = kVar.getItem(0);
                if (EmojiStoreV2RewardUI.this.f268862r.getText() != null) {
                    a.f136607e = EmojiStoreV2RewardUI.this.f268862r.getText().toString();
                    EmojiStoreV2RewardUI emojiStoreV2RewardUI = EmojiStoreV2RewardUI.this;
                    String str = emojiStoreV2RewardUI.f268851d;
                    emojiStoreV2RewardUI.mo127838J7();
                    emojiStoreV2RewardUI.f268867w = new C46436d(str, a, emojiStoreV2RewardUI.f268853f, emojiStoreV2RewardUI.f268854g);
                    C86709a0.m107529k().f251779b.mo123460f(emojiStoreV2RewardUI.f268867w);
                } else {
                    Log.m105928w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mRewardInputView is null");
                }
            } else {
                Log.m105928w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mAdapter is null.");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$c */
    public class C93232c implements View.OnClickListener {
        public C93232c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiStoreV2RewardUI emojiStoreV2RewardUI = EmojiStoreV2RewardUI.this;
            if (emojiStoreV2RewardUI.f268870z == C93239j.NORMAL) {
                emojiStoreV2RewardUI.mo127840L7(C93239j.CUSTOM);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$d */
    public class C93233d implements TextWatcher {
        public C93233d() {
        }

        public void afterTextChanged(Editable editable) {
            if (EmojiStoreV2RewardUI.this.f268863s == null) {
                return;
            }
            if (editable == null || editable.length() <= 0) {
                EmojiStoreV2RewardUI.this.f268863s.setEnabled(false);
                return;
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            if (indexOf > 0 && (obj.length() - indexOf) - 1 > 2) {
                editable.delete(indexOf + 3, indexOf + 4);
            }
            float f = 0.0f;
            try {
                f = Float.valueOf(editable.toString()).floatValue();
            } catch (NumberFormatException unused) {
            }
            if (f > 200.0f || f < 1.0f) {
                EmojiStoreV2RewardUI.this.f268862r.getContentEditText().setTextColor(EmojiStoreV2RewardUI.this.getContext().getResources().getColor(C0966R.color.a_0));
                EmojiStoreV2RewardUI.this.f268863s.setEnabled(false);
                return;
            }
            EmojiStoreV2RewardUI.this.f268862r.getContentEditText().setTextColor(EmojiStoreV2RewardUI.this.getContext().getResources().getColor(C0966R.color.a7f));
            EmojiStoreV2RewardUI.this.f268863s.setEnabled(true);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$e */
    public class C93234e implements C98661k {
        public C93234e() {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            if (!Util.isNullOrNil(str) && str.equalsIgnoreCase(EmojiStoreV2RewardUI.this.f268868x)) {
                Message message = new Message();
                message.what = 1001;
                EmojiStoreV2RewardUI emojiStoreV2RewardUI = EmojiStoreV2RewardUI.this;
                message.obj = emojiStoreV2RewardUI.f268869y;
                emojiStoreV2RewardUI.f268846B.sendMessage(message);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$f */
    public class C93235f implements Runnable {
        public C93235f() {
        }

        public void run() {
            EmojiStoreV2RewardUI emojiStoreV2RewardUI = EmojiStoreV2RewardUI.this;
            emojiStoreV2RewardUI.f268870z = C93239j.NORMAL;
            View view = emojiStoreV2RewardUI.f268861q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchNormal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchNormal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = emojiStoreV2RewardUI.f268860p;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchNormal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchNormal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                emojiStoreV2RewardUI.f268861q.startAnimation(AnimationUtils.loadAnimation(emojiStoreV2RewardUI.getContext(), C0966R.C0968anim.f2461dn));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$g */
    public class C93236g implements MenuItem.OnMenuItemClickListener {
        public C93236g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmojiStoreV2RewardUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$h */
    public class C93237h implements DialogInterface.OnCancelListener {
        public C93237h() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(EmojiStoreV2RewardUI.this.f268867w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$i */
    public class C93238i implements DialogInterface.OnClickListener {
        public C93238i(EmojiStoreV2RewardUI emojiStoreV2RewardUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$j */
    public enum C93239j {
        NORMAL,
        CUSTOM
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$k */
    public class C93240k extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<C50094k80> f268882d;

        public C93240k() {
        }

        /* renamed from: a */
        public C50094k80 getItem(int i) {
            LinkedList<C50094k80> linkedList;
            if (i < 0 || i > getCount() || (linkedList = this.f268882d) == null) {
                return null;
            }
            return linkedList.get(i);
        }

        public int getCount() {
            LinkedList<C50094k80> linkedList = this.f268882d;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C93241l lVar;
            if (view == null || view.getTag() == null) {
                view = C85868k2.m106137b(EmojiStoreV2RewardUI.this.getContext()).inflate(C0966R.C0971layout.f359654a31, (ViewGroup) null);
                lVar = new C93241l(EmojiStoreV2RewardUI.this, view);
                view.setTag(lVar);
            } else {
                lVar = (C93241l) view.getTag();
            }
            C50094k80 a = getItem(i);
            if (a != null) {
                lVar.f268884a.setVisibility(0);
                TextView textView = lVar.f268884a;
                textView.setText(a.f136607e + a.f136606d);
            } else {
                lVar.f268884a.setVisibility(8);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI$l */
    public class C93241l {

        /* renamed from: a */
        public TextView f268884a;

        public C93241l(EmojiStoreV2RewardUI emojiStoreV2RewardUI, View view) {
            this.f268884a = (TextView) view.findViewById(C0966R.C0970id.i2l);
        }
    }

    /* renamed from: H7 */
    public final void mo127836H7(boolean z) {
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardUI", "doGetRewardScene");
        if (z) {
            C86709a0.m107529k().f251779b.mo123460f(new C33523r(this.f268851d, 0));
            return;
        }
        C86709a0.m107529k().f251779b.mo123460f(new C33523r(this.f268851d, 1));
        mo127838J7();
    }

    /* renamed from: I7 */
    public final void mo127837I7(String str) {
        C76879j.m92754y(getContext(), str, (String) null, getString(C0966R.string.c7z), new C93238i(this));
    }

    /* renamed from: J7 */
    public final void mo127838J7() {
        this.f268859o = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C93237h());
    }

    /* renamed from: K7 */
    public final void mo127839K7() {
        Intent intent = new Intent();
        intent.setClass(this, EmojiStoreV2RewardThanksUI.class);
        intent.putExtra("extra_id", this.f268851d);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "startThanksUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "startThanksUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: L7 */
    public final void mo127840L7(C93239j jVar) {
        C93239j jVar2 = C93239j.CUSTOM;
        if (jVar == jVar2) {
            this.f268870z = jVar2;
            View view = this.f268861q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchMode", "(Lcom/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchMode", "(Lcom/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f268861q.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di));
                this.f268862r.getContentEditText().requestFocus();
                showVKB();
                View view3 = this.f268860p;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchMode", "(Lcom/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "switchMode", "(Lcom/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        hideVKB();
        this.f268846B.postDelayed(new C93235f(), 300);
    }

    /* renamed from: M7 */
    public final void mo127841M7() {
        if (this.f268855h != null) {
            this.f268864t.setVisibility(0);
            this.f268865u.setVisibility(0);
            C50228l80 l802 = this.f268855h.f143785g;
            if (l802 == null || Util.isNullOrNil(l802.f137245e)) {
                this.f268856i.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4937rs));
                this.f268856i.setImageDrawable(this.f268857j);
                this.f268856i.setScaleType(ImageView.ScaleType.CENTER);
                this.f268857j.start();
            } else {
                this.f268868x = this.f268855h.f143785g.f137245e;
                String p = EmojiLogic.m117485p(C101964h.m134224f(), this.f268851d, this.f268868x);
                this.f268869y = p;
                if (C86013q1.m106450k(p)) {
                    this.f268856i.setImageFilePath(this.f268869y);
                    this.f268856i.setScaleType(ImageView.ScaleType.FIT_XY);
                    AnimationDrawable animationDrawable = this.f268857j;
                    if (animationDrawable != null && animationDrawable.isRunning()) {
                        this.f268857j.stop();
                    }
                } else {
                    C20828a b = C20828a.m22825b();
                    String str = this.f268868x;
                    b.mo32521j(str, this.f268856i, C98601f.m128141f(this.f268851d, str, new Object[0]), this.f268850F);
                    this.f268856i.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4937rs));
                    this.f268856i.setImageDrawable(this.f268857j);
                    this.f268856i.setScaleType(ImageView.ScaleType.CENTER);
                    this.f268857j.start();
                }
            }
        } else {
            this.f268864t.setVisibility(8);
            this.f268865u.setVisibility(8);
        }
        C51759vz1 vz12 = this.f268855h;
        if (vz12 == null || vz12.f143782d == null) {
            this.f268858n.setVisibility(8);
            return;
        }
        this.f268858n.setVisibility(0);
        C93240k kVar = this.f268866v;
        LinkedList<C50094k80> linkedList = this.f268855h.f143782d;
        if (kVar.f268882d == null) {
            kVar.f268882d = new LinkedList<>();
        }
        kVar.f268882d.clear();
        kVar.f268882d.addAll(linkedList);
        kVar.notifyDataSetChanged();
    }

    /* renamed from: c4 */
    public void mo94739c4(String str) {
        String str2 = str;
        if (str2.equalsIgnoreCase("ok")) {
            mo127839K7();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 1);
            nVar.idkeyStat(408, 9, 1, false);
            mo127836H7(true);
            finish();
        } else if (str2.equalsIgnoreCase("cancel")) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 3);
            nVar2.idkeyStat(408, 3, 1, false);
        } else if (str2.equalsIgnoreCase("fail")) {
            if (!this.f268845A) {
                this.f268845A = true;
                C115669n.INSTANCE.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 2);
            }
            C115669n.INSTANCE.idkeyStat(408, 4, 1, false);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359656a33;
    }

    public void initView() {
        if (Util.isNullOrNil(this.f268852e)) {
            setMMTitle((int) C0966R.string.c9b);
        } else {
            setMMTitle(getString(C0966R.string.c9v, new Object[]{this.f268852e}));
        }
        setMMSubTitle((int) C0966R.string.lii);
        setBackBtn(new C93236g());
        this.f268860p = findViewById(C0966R.C0970id.isj);
        this.f268861q = findViewById(C0966R.C0970id.isk);
        this.f268862r = (MMFormInputView) findViewById(C0966R.C0970id.isl);
        Button button = (Button) findViewById(C0966R.C0970id.ism);
        this.f268863s = button;
        button.setOnClickListener(this.f268847C);
        this.f268863s.setEnabled(false);
        this.f268862r.setInputType(8194);
        this.f268862r.mo101680a(this.f268849E);
        this.f268862r.getContentEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        TextView textView = (TextView) findViewById(C0966R.C0970id.ish);
        this.f268864t = textView;
        textView.setOnClickListener(this.f268848D);
        this.f268865u = (TextView) findViewById(C0966R.C0970id.isf);
        this.f268856i = (EmojiStoreV2RewardBannerView) findViewById(C0966R.C0970id.a85);
        this.f268858n = (GridInScrollView) findViewById(16908298);
        C93240k kVar = new C93240k();
        this.f268866v = kVar;
        this.f268858n.setAdapter(kVar);
        this.f268858n.setOnItemClickListener(this);
        this.f268857j = (AnimationDrawable) getResources().getDrawable(C0966R.C0969drawable.emoji_doge_loading);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        if (i == 8001) {
            if (i3 == -1) {
                mo127839K7();
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 1);
                nVar.idkeyStat(408, 9, 1, false);
                mo127836H7(true);
                finish();
            } else if (i3 == 0) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 3);
                nVar2.idkeyStat(408, 3, 1, false);
            } else {
                if (!this.f268845A) {
                    this.f268845A = true;
                    C115669n.INSTANCE.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 2);
                }
                C115669n.INSTANCE.idkeyStat(408, 4, 1, false);
            }
        }
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardUI", keyboardState() + "");
        C93239j jVar = this.f268870z;
        C93239j jVar2 = C93239j.NORMAL;
        if (jVar == jVar2) {
            if (this.f268845A) {
                C115669n.INSTANCE.idkeyStat(408, 2, 1, false);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(408, 1, 1, false);
                nVar.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 4);
            }
            super.onBackPressed();
            return;
        }
        mo127840L7(jVar2);
    }

    public void onCreate(Bundle bundle) {
        C38142q qVar;
        super.onCreate(bundle);
        this.f268851d = getIntent().getStringExtra("extra_id");
        this.f268852e = getIntent().getStringExtra("name");
        this.f268854g = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f268853f = getIntent().getIntExtra("pageType", 0);
        initView();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            qVar = h.f82777i;
        }
        C51759vz1 jo = qVar.mo61539jo(this.f268851d);
        this.f268855h = jo;
        if (jo == null || jo.f143785g == null) {
            mo127836H7(false);
        } else {
            C20828a b = C20828a.m22825b();
            String str = this.f268855h.f143785g.f137246f;
            b.mo32519h(str, (ImageView) null, C98601f.m128141f(this.f268851d, str, new Object[0]));
            C20828a b2 = C20828a.m22825b();
            String str2 = this.f268855h.f143785g.f137247g;
            b2.mo32519h(str2, (ImageView) null, C98601f.m128141f(this.f268851d, str2, new Object[0]));
        }
        mo127841M7();
        C86709a0.m107529k().f251779b.mo123455a(830, this);
        C86709a0.m107529k().f251779b.mo123455a(822, this);
        C115669n.INSTANCE.idkeyStat(408, 0, 1, false);
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(830, this);
        C86709a0.m107529k().f251779b.mo123470p(822, this);
        AnimationDrawable animationDrawable = this.f268857j;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f268857j.stop();
        }
        C20828a.m22825b().mo32513a((String) null, this.f268856i);
        this.f268850F.f268232a = null;
        this.f268850F = null;
        super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C50094k80 a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C93240k kVar = this.f268866v;
        if (!(kVar == null || (a = kVar.getItem(i)) == null)) {
            Log.m105925i("MicroMsg.emoji.EmojiStoreV2RewardUI", "onItemClick position:%d", Integer.valueOf(i));
            String str = this.f268851d;
            mo127838J7();
            this.f268867w = new C46436d(str, a, this.f268853f, this.f268854g);
            C86709a0.m107529k().f251779b.mo123460f(this.f268867w);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Class cls = C76324c.class;
        ProgressDialog progressDialog = this.f268859o;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f268859o.dismiss();
        }
        int type = yVar.getType();
        if (type != 822) {
            if (type != 830) {
                Log.m105925i("MicroMsg.emoji.EmojiStoreV2RewardUI", "unknown scene. type:%d", Integer.valueOf(type));
                return;
            }
            C46436d dVar = (C46436d) yVar2;
            if (i3 == 0 && i4 == 0) {
                boolean isSwitch2InWxAppPay = ((C76324c) C86312j.m106911c(cls)).isSwitch2InWxAppPay(((C50790p7) dVar.f125061d.f127056b.f127083a).f139612d);
                Log.m105925i("MicroMsg.emoji.EmojiStoreV2RewardUI", "doEmojiReward, isSwitch2InWxAppPay:%b", Boolean.valueOf(isSwitch2InWxAppPay));
                if (isSwitch2InWxAppPay) {
                    Bundle bundle = new Bundle();
                    bundle.putString("prepayId", ((C50790p7) dVar.f125061d.f127056b.f127083a).f139612d);
                    bundle.putInt("payScene", 5);
                    bundle.putInt("payChannel", 0);
                    ((C76324c) C86312j.m106911c(cls)).startInWxAppPayUseCase(this, bundle);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("extinfo_key_10", true);
                AppCompatActivity context = getContext();
                C47465a aVar = dVar.f125061d.f127056b.f127083a;
                ((C15919f) C86312j.m106911c(C15919f.class)).mo14575sP(context, ((C50790p7) aVar).f139612d, ((C50790p7) aVar).f139613e, 5, 8001, bundle2);
            } else if (i3 == 4) {
                if (!this.f268845A) {
                    this.f268845A = true;
                    C115669n.INSTANCE.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 2);
                }
                if (i4 == 6) {
                    C115669n.INSTANCE.idkeyStat(408, 6, 1, false);
                    if (Util.isNullOrNil(str)) {
                        mo127837I7(getString(C0966R.string.c9h));
                    } else {
                        mo127837I7(str2);
                    }
                } else if (i4 == 7) {
                    C115669n.INSTANCE.idkeyStat(408, 7, 1, false);
                    if (Util.isNullOrNil(str)) {
                        mo127837I7(getString(C0966R.string.c9j));
                    } else {
                        mo127837I7(str2);
                    }
                } else if (i4 == 10) {
                    C115669n.INSTANCE.idkeyStat(408, 5, 1, false);
                    if (Util.isNullOrNil(str)) {
                        mo127837I7(getString(C0966R.string.c9i));
                    } else {
                        mo127837I7(str2);
                    }
                } else {
                    C115669n.INSTANCE.idkeyStat(408, 8, 1, false);
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.c85), 0).show();
                }
            } else {
                if (!this.f268845A) {
                    this.f268845A = true;
                    C115669n.INSTANCE.mo160131h(12738, this.f268851d, Integer.valueOf(this.f268853f), Integer.valueOf(this.f268854g), 2);
                }
                C115669n.INSTANCE.idkeyStat(408, 8, 1, false);
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.c85), 0).show();
            }
        } else if (yVar2 instanceof C33523r) {
            C33523r rVar = (C33523r) yVar2;
            if (i3 == 0 && i4 == 0) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward success.");
                this.f268855h = rVar.mo59186j1();
                C20828a b = C20828a.m22825b();
                String str3 = this.f268855h.f143785g.f137246f;
                b.mo32519h(str3, (ImageView) null, C98601f.m128141f(this.f268851d, str3, new Object[0]));
                this.f268846B.sendEmptyMessage(1002);
                return;
            }
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward failed.");
        }
    }
}
