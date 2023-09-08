package com.tencent.p014mm.plugin.announcement;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OplogServiceResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import de3.C45331f0;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import kb0.C76528a;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import ol0.C117820l0;
import p148ei.C7660a;
import p196ln.C76705f;
import p629ny.C76979h;
import p645pj.C77092c;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C50071k24;
import te3.C50206l24;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI */
public class RoomCardUI extends MMActivity implements C11385n {

    /* renamed from: x */
    public static final /* synthetic */ int f196962x = 0;

    /* renamed from: d */
    public String f196963d;

    /* renamed from: e */
    public String f196964e;

    /* renamed from: f */
    public int f196965f;

    /* renamed from: g */
    public boolean f196966g;

    /* renamed from: h */
    public boolean f196967h;

    /* renamed from: i */
    public String f196968i;

    /* renamed from: j */
    public String f196969j;

    /* renamed from: n */
    public long f196970n;

    /* renamed from: o */
    public C89779i0 f196971o;

    /* renamed from: p */
    public MMEditText f196972p;

    /* renamed from: q */
    public TextView f196973q;

    /* renamed from: r */
    public TextView f196974r;

    /* renamed from: s */
    public ImageView f196975s;

    /* renamed from: t */
    public LinearLayout f196976t;

    /* renamed from: u */
    public LinearLayout f196977u;

    /* renamed from: v */
    public KeyboardHeightProvider f196978v;

    /* renamed from: w */
    public boolean f196979w = false;

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$a */
    public class C68556a implements C87581a<Object, C89132b.C89134c<C50206l24>> {
        public C68556a() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            RoomCardUI roomCardUI = RoomCardUI.this;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            int i3 = RoomCardUI.f196962x;
            roomCardUI.mo94207M7(i, i2, str);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$b */
    public class C68557b implements C7020t0 {
        public C68557b() {
        }

        /* renamed from: Q1 */
        public void mo531Q1(int i, boolean z) {
            if (i > 0) {
                ViewGroup viewGroup = (ViewGroup) RoomCardUI.this.findViewById(C0966R.C0970id.j48);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (-1 == layoutParams.height) {
                    layoutParams.width = -1;
                    layoutParams.height = viewGroup.getHeight() - i;
                    viewGroup.requestLayout();
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) RoomCardUI.this.findViewById(C0966R.C0970id.j48);
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            viewGroup2.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$c */
    public class C68558c implements MenuItem.OnMenuItemClickListener {
        public C68558c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            int i;
            int i2;
            int i3;
            if (menuItem.getTitle().equals(RoomCardUI.this.getString(C0966R.string.f8014z_))) {
                RoomCardUI.this.hideVKB();
                RoomCardUI.this.f196972p.clearFocus();
                RoomCardUI roomCardUI = RoomCardUI.this;
                if (!roomCardUI.mo94206L7()) {
                    roomCardUI.mo94204J7();
                } else {
                    String str = roomCardUI.f196972p.getText().toString() + "";
                    String e = C77092c.m93043e();
                    if (!Util.isNullOrNil(e)) {
                        if (str.matches(".*[" + e + "].*")) {
                            C76879j.m92748s(roomCardUI.getContext(), roomCardUI.getString(C0966R.string.frk, new Object[]{e}), roomCardUI.getString(C0966R.string.a3h));
                        }
                    }
                    roomCardUI.showVKB();
                    if (Util.isNullOrNil(roomCardUI.f196972p.getText().toString())) {
                        i3 = C0966R.string.js9;
                        i2 = C0966R.string.js8;
                        i = 5;
                    } else {
                        i3 = C0966R.string.ha6;
                        i2 = C0966R.string.ha8;
                        i = 6;
                    }
                    C77426q qVar = new C77426q(roomCardUI);
                    qVar.mo107595g(roomCardUI.getString(i3));
                    qVar.mo107601m(i2);
                    qVar.mo107600l(new C68573k(roomCardUI, i));
                    qVar.mo107598j(roomCardUI.getString(C0966R.string.ha7));
                    qVar.mo107597i(new C68572j(roomCardUI, i));
                    qVar.mo107603o();
                }
                RoomCardUI.m80818H7(RoomCardUI.this, 5);
                return true;
            }
            RoomCardUI.this.f196972p.setEnabled(true);
            RoomCardUI.this.f196972p.setFocusableInTouchMode(true);
            RoomCardUI.this.f196972p.setFocusable(true);
            RoomCardUI.this.f196972p.setCursorVisible(true);
            RoomCardUI roomCardUI2 = RoomCardUI.this;
            roomCardUI2.updateOptionMenuText(0, roomCardUI2.getString(C0966R.string.f8014z_));
            RoomCardUI.this.updateOptionMenuStyle(0, MMActivityController.C73075r.GREEN);
            RoomCardUI.this.enableOptionMenu(false);
            RoomCardUI.this.f196972p.requestFocus();
            MMEditText mMEditText = RoomCardUI.this.f196972p;
            mMEditText.setSelection(mMEditText.getText().toString().length());
            RoomCardUI.this.showVKB();
            RoomCardUI.m80818H7(RoomCardUI.this, 3);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$d */
    public class C68559d implements View.OnLongClickListener {
        public C68559d() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/announcement/RoomCardUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            RoomCardUI roomCardUI = RoomCardUI.this;
            MMEditText mMEditText = roomCardUI.f196972p;
            roomCardUI.getClass();
            LayoutInflater.from(roomCardUI);
            C77407n nVar = new C77407n((Context) roomCardUI, 1, false);
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            C68575m mVar = new C68575m(roomCardUI);
            C68576n nVar2 = new C68576n(roomCardUI, mMEditText);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList2.clear();
            C76874e0 e0Var = new C76874e0(roomCardUI);
            mVar.onCreateMMMenu(e0Var);
            if (e0Var.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = mVar;
                nVar.f225782p = nVar2;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/announcement/RoomCardUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$e */
    public class C68560e implements Runnable {

        /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$e$a */
        public class C68561a implements Runnable {
            public C68561a() {
            }

            public void run() {
                C45612m0.m50676C(RoomCardUI.this.f196963d);
            }
        }

        public C68560e() {
        }

        public void run() {
            RoomCardUI.m80818H7(RoomCardUI.this, 4);
            RoomCardUI roomCardUI = RoomCardUI.this;
            int i = 0;
            int intExtra = roomCardUI.getIntent().getIntExtra("from_scene", 0);
            ViewRoomDescStruct viewRoomDescStruct = new ViewRoomDescStruct();
            viewRoomDescStruct.f194654d = viewRoomDescStruct.mo86045b("ChatName", roomCardUI.f196963d, true);
            long j = 1;
            viewRoomDescStruct.f194657g = C45628s0.m50739D(roomCardUI.f196963d) ? 0 : 1;
            viewRoomDescStruct.f194656f = (long) roomCardUI.f196965f;
            viewRoomDescStruct.f194659i = viewRoomDescStruct.mo86045b("NoticeId", "" + roomCardUI.f196970n, true);
            if (!roomCardUI.f196966g) {
                if (roomCardUI.f196967h) {
                    i = 2;
                }
                j = (long) i;
            }
            viewRoomDescStruct.f194655e = j;
            viewRoomDescStruct.f194658h = (long) intExtra;
            viewRoomDescStruct.mo86054n();
            RoomCardUI.this.runOnUiThread(new C68561a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$f */
    public class C68562f implements MenuItem.OnMenuItemClickListener {
        public C68562f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RoomCardUI roomCardUI = RoomCardUI.this;
            int i = RoomCardUI.f196962x;
            roomCardUI.mo94205K7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$g */
    public class C68563g implements C47883u {
        public C68563g() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            RoomCardUI.this.setResult(0);
            RoomCardUI.this.finish();
            RoomCardUI.m80818H7(RoomCardUI.this, 11);
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$h */
    public class C68564h implements C47883u {
        public C68564h() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            RoomCardUI.m80818H7(RoomCardUI.this, 10);
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.RoomCardUI$i */
    public class C68565i implements TextWatcher {
        public C68565i(C68557b bVar) {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            RoomCardUI roomCardUI = RoomCardUI.this;
            int i4 = RoomCardUI.f196962x;
            roomCardUI.mo94203I7();
        }
    }

    public RoomCardUI() {
        new IListener<OplogServiceResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1984241019;
            }

            public boolean callback(IEvent iEvent) {
                C89779i0 i0Var;
                OplogServiceResultEvent.C40152a aVar = ((OplogServiceResultEvent) iEvent).f107687d;
                String str = aVar.f107689b;
                String str2 = aVar.f107690c;
                int i = aVar.f107688a;
                if (i != 0 && str2 != null) {
                    C76879j.m92748s(RoomCardUI.this, str2, str);
                    RoomCardUI roomCardUI = RoomCardUI.this;
                    int i2 = RoomCardUI.f196962x;
                    roomCardUI.getClass();
                } else if (i == 0) {
                    RoomCardUI roomCardUI2 = RoomCardUI.this;
                    if (!roomCardUI2.f196979w) {
                        roomCardUI2.mo94204J7();
                    } else {
                        roomCardUI2.mo94208N7(roomCardUI2.f196972p.getText().toString());
                    }
                }
                RoomCardUI roomCardUI3 = RoomCardUI.this;
                if (roomCardUI3.f196979w || (i0Var = roomCardUI3.f196971o) == null || !i0Var.isShowing()) {
                    return false;
                }
                RoomCardUI.this.f196971o.dismiss();
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m80818H7(RoomCardUI roomCardUI, int i) {
        long j;
        roomCardUI.getClass();
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.mo93200s(roomCardUI.f196963d);
        viewRoomDescTipsStruct.f194663f = (long) roomCardUI.f196965f;
        if (roomCardUI.f196966g) {
            j = 1;
        } else {
            j = (long) (roomCardUI.f196967h ? 2 : 0);
        }
        viewRoomDescTipsStruct.f194662e = j;
        viewRoomDescTipsStruct.mo93201t("" + roomCardUI.f196970n);
        viewRoomDescTipsStruct.f194664g = (long) i;
        viewRoomDescTipsStruct.mo86054n();
    }

    /* renamed from: I7 */
    public final void mo94203I7() {
        if (mo94206L7()) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
    }

    /* renamed from: J7 */
    public final void mo94204J7() {
        Intent intent = new Intent();
        intent.putExtra("room_name", this.f196964e);
        intent.putExtra("room_notice", this.f196968i);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: K7 */
    public final void mo94205K7() {
        if (!this.f196966g && !this.f196967h) {
            setResult(0);
            finish();
        } else if (mo94206L7()) {
            C77426q qVar = new C77426q(this);
            qVar.mo107595g(getString(C0966R.string.i5l));
            qVar.mo107601m(C0966R.string.i5n);
            qVar.mo107600l(new C68564h());
            qVar.mo107598j(getString(C0966R.string.i5m));
            qVar.mo107597i(new C68563g());
            qVar.mo107603o();
        } else {
            setResult(0);
            finish();
        }
    }

    /* renamed from: L7 */
    public final boolean mo94206L7() {
        String obj = this.f196972p.getText().toString();
        if (Util.isNullOrNil(obj)) {
            return !Util.isNullOrNil(this.f196968i);
        }
        String str = this.f196968i;
        return str == null || !str.equals(obj);
    }

    /* renamed from: M7 */
    public final void mo94207M7(int i, int i2, String str) {
        C89779i0 i0Var = this.f196971o;
        if (i0Var != null && i0Var.isShowing()) {
            this.f196971o.dismiss();
        }
        C89779i0 i0Var2 = this.f196971o;
        if (i0Var2 != null && i0Var2.isShowing()) {
            this.f196971o.dismiss();
        }
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement successfully!]");
            this.f196968i = this.f196972p.getText().toString();
            C115669n.INSTANCE.idkeyStat(219, 15, 1, true);
            mo94204J7();
            return;
        }
        Log.m105929w("MicroMsg.RoomInfoUI", "dz[handleSetNoticeFailed:%s]", str);
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8793c(this, new C68574l(this));
        }
        Log.m105925i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* renamed from: N7 */
    public final void mo94208N7(String str) {
        mo94206L7();
        C50071k24 k242 = new C50071k24();
        k242.f136519d = this.f196963d;
        k242.f136520e = str;
        k242.f136525j = 1;
        k242.mo73343b().mo9225i().mo11397F(this).mo123062e(new C68556a());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bts;
    }

    public void initView() {
        Class cls = C76979h.class;
        setMMTitle((int) C0966R.string.f361216i81);
        setNavigationbarColor(getResources().getColor(C0966R.color.al6));
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        this.f196978v = new KeyboardHeightProvider(this);
        getWindow().setSoftInputMode(48);
        this.f196978v.f220015b = new C68557b();
        addTextOptionMenu(0, getString(C0966R.string.f7956xe), new C68558c(), (View.OnLongClickListener) null, MMActivityController.C73075r.BLACK);
        enableOptionMenu(true);
        this.f196976t = (LinearLayout) findViewById(C0966R.C0970id.euz);
        this.f196977u = (LinearLayout) findViewById(C0966R.C0970id.ivy);
        this.f196972p = (MMEditText) findViewById(C0966R.C0970id.hje);
        this.f196973q = (TextView) findViewById(C0966R.C0970id.hjh);
        this.f196974r = (TextView) findViewById(C0966R.C0970id.hjg);
        this.f196975s = (ImageView) findViewById(C0966R.C0970id.hjf);
        this.f196972p.setText(this.f196968i);
        WindowManager windowManager = (WindowManager) getSystemService("window");
        this.f196972p.setMinHeight(((windowManager.getDefaultDisplay().getHeight() * 2) / 3) - 100);
        C86709a0.m107528h();
        Bundle a = C45331f0.m50242a(true, C76528a.m92004a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f196963d).getUsername()));
        a.putInt("geta8key_scene", 31);
        ((C76979h) C86312j.m106911c(cls)).mo107085xb(this.f196972p, 1, a, (String) null, C76979h.f224926w0);
        ((TextView) findViewById(C0966R.C0970id.f358537fn0)).setText(Integer.toString(C45078p0.m49923b(280, this.f196968i)));
        this.f196972p.setCursorVisible(false);
        this.f196972p.setFocusable(false);
        if (this.f196966g || this.f196967h) {
            this.f196977u.setVisibility(8);
        } else {
            removeOptionMenu(0);
            this.f196977u.setVisibility(0);
            this.f196972p.setFocusable(false);
            this.f196972p.setCursorVisible(false);
            this.f196972p.setOnLongClickListener(new C68559d());
        }
        if (this.f196970n != 0) {
            this.f196973q.setVisibility(0);
            this.f196973q.setText(C72715f.m85111d("yyyy-MM-dd HH:mm", this.f196970n));
        } else {
            this.f196973q.setVisibility(8);
        }
        if (Util.isNullOrNil(this.f196968i)) {
            this.f196972p.setEnabled(true);
            this.f196972p.setFocusableInTouchMode(true);
            this.f196972p.setFocusable(true);
            this.f196976t.setVisibility(8);
            this.f196972p.setMinHeight(((windowManager.getDefaultDisplay().getHeight() * 2) / 3) + 100);
            this.f196972p.requestFocus();
            this.f196972p.setCursorVisible(true);
            updateOptionMenuText(0, getContext().getString(C0966R.string.f8014z_));
            updateOptionMenuStyle(0, MMActivityController.C73075r.GREEN);
            mo94203I7();
            this.f196972p.performClick();
            showVKB();
        } else {
            this.f196976t.setVisibility(0);
        }
        this.f196974r.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f196969j), this.f196974r.getTextSize()));
        ImageView imageView = this.f196975s;
        String str = this.f196969j;
        if (Util.isNullOrNil(str)) {
            imageView.setImageResource(C0966R.C0969drawable.bfa);
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
        }
        this.f196972p.addTextChangedListener(new C68565i((C68557b) null));
        ((C119157j) C119157j.f356862d).mo183870a(new C68560e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 6) {
            mo94208N7(intent.getStringExtra("KEY_CONTENT_XML"));
        }
    }

    public void onCreate(Bundle bundle) {
        long j;
        super.onCreate(bundle);
        C115669n.INSTANCE.idkeyStat(219, 0, 1, true);
        C86709a0.m107529k().f251779b.mo123455a(C117820l0.CTRL_INDEX, this);
        this.f196963d = getIntent().getStringExtra("RoomInfo_Id");
        this.f196968i = getIntent().getStringExtra("room_notice");
        this.f196969j = getIntent().getStringExtra("room_notice_editor");
        this.f196970n = getIntent().getLongExtra("room_notice_publish_time", 0);
        this.f196964e = getIntent().getStringExtra("room_name");
        int i = 0;
        this.f196965f = getIntent().getIntExtra("room_member_count", 0);
        getIntent().getStringExtra("room_owner_name");
        this.f196966g = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f196967h = getIntent().getBooleanExtra("Is_RoomManager", false);
        initView();
        setBackBtn(new C68562f());
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.mo93200s(this.f196963d);
        viewRoomDescTipsStruct.f194663f = (long) this.f196965f;
        boolean z = this.f196966g;
        if (z) {
            j = 1;
        } else {
            if (z) {
                i = 2;
            }
            j = (long) i;
        }
        viewRoomDescTipsStruct.f194662e = j;
        viewRoomDescTipsStruct.mo93201t("" + this.f196970n);
        viewRoomDescTipsStruct.f194664g = 1;
        viewRoomDescTipsStruct.mo86054n();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(C117820l0.CTRL_INDEX, this);
        C89779i0 i0Var = this.f196971o;
        if (i0Var != null && i0Var.isShowing()) {
            this.f196971o.dismiss();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        super.onKeyDown(i, keyEvent);
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        mo94205K7();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f196978v.mo104021d();
    }

    public void onResume() {
        super.onResume();
        this.f196978v.mo104022e();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 993) {
            mo94207M7(i, i2, str);
            return;
        }
        Log.m105929w("MicroMsg.RoomInfoUI", "error cgi type callback:[%d]", Integer.valueOf(yVar.getType()));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f196978v.mo104022e();
        }
    }
}
