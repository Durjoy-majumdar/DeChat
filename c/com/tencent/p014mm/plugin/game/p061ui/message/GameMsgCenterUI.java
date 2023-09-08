package com.tencent.p014mm.plugin.game.p061ui.message;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import in3.C46279a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI */
public class GameMsgCenterUI extends MMActivity {

    /* renamed from: d */
    public int f114476d;

    /* renamed from: e */
    public int f114477e = 0;

    /* renamed from: f */
    public TextView f114478f;

    /* renamed from: g */
    public TabItemView f114479g;

    /* renamed from: h */
    public TabItemView f114480h;

    /* renamed from: i */
    public CustomViewPager f114481i;

    /* renamed from: j */
    public C42340c f114482j;

    /* renamed from: n */
    public C42353j f114483n;

    /* renamed from: o */
    public int f114484o;

    /* renamed from: p */
    public int f114485p;

    /* renamed from: q */
    public int f114486q = 0;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI$GameMsgCenterFragment */
    public static class GameMsgCenterFragment extends HellAndroidXFragment {

        /* renamed from: d */
        public View f114487d;

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return this.f114487d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI$a */
    public static class C42322a extends C112968x {

        /* renamed from: i */
        public List<GameMsgCenterFragment> f114488i = new ArrayList();

        public C42322a(FragmentManager fragmentManager) {
            super(fragmentManager, 0);
        }

        public int getCount() {
            return ((ArrayList) this.f114488i).size();
        }

        public Fragment getItem(int i) {
            List<GameMsgCenterFragment> list = this.f114488i;
            return (Fragment) ((ArrayList) list).get(i % ((ArrayList) list).size());
        }
    }

    /* renamed from: H7 */
    public void mo66395H7(int i) {
        int i2 = i % 2;
        this.f114486q = i2;
        if (i2 == 0) {
            this.f114479g.setSelected(true);
            this.f114480h.setSelected(false);
            C42340c cVar = this.f114482j;
            if (cVar != null) {
                cVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("tab", "1");
                hashMap.put("newmsg", String.valueOf(cVar.f114552g));
                C40314g.m43484c(cVar.getContext(), 13, 1300, 0, 1, cVar.f114549d, C40314g.m43483b(hashMap));
                cVar.f114552g = 0;
            }
        } else {
            this.f114479g.setSelected(false);
            this.f114480h.setSelected(true);
            C42353j jVar = this.f114483n;
            if (jVar != null) {
                jVar.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("tab", "2");
                hashMap2.put("newnotice", String.valueOf(jVar.f114572g));
                C40314g.m43484c(jVar.getContext(), 13, 1300, 0, 1, jVar.f114569d, C40314g.m43483b(hashMap2));
                jVar.f114572g = 0;
            }
        }
        this.f114481i.setCurrentItem(this.f114486q);
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.gsy;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.axb;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C48484q.class;
        super.onCreate(bundle);
        getSupportActionBar().mo91104o();
        C46279a.m51577a(getContentView(), getResources().getColor(C0966R.color.al6), !C74933u4.m89770g(getResources().getColor(C0966R.color.al6)));
        this.f114476d = getIntent().getIntExtra("game_report_from_scene", 0);
        String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        int intExtra = getIntent().getIntExtra("game_msg_center_tab_type", 0);
        if (intExtra == 1) {
            this.f114477e = 1;
        } else if (intExtra == 2) {
            this.f114477e = 2;
        } else {
            C42119w bD = ((C48484q) C86312j.m106911c(cls)).xi0().mo66004bD(stringExtra);
            if (bD != null) {
                this.f114477e = bD.field_showType;
            }
        }
        if (this.f114477e == 0) {
            this.f114484o = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1);
            int mL = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(2);
            this.f114485p = mL;
            if (this.f114484o > 0) {
                this.f114477e = 1;
            } else if (mL > 0) {
                this.f114477e = 2;
            } else {
                this.f114477e = 1;
            }
        }
        findViewById(C0966R.C0970id.f5441f8).setOnClickListener(new C4571d(this));
        findViewById(C0966R.C0970id.f5459fp).setOnClickListener(new C42341e(this));
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5464fu);
        this.f114478f = textView;
        C44706b.m49451b(textView, C0966R.dimen.f3635t);
        View findViewById = findViewById(C0966R.C0970id.f5463ft);
        this.f114478f.setVisibility(0);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f114477e == 2) {
            this.f114478f.setText(C0966R.string.fad);
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.GAME_MSG_NOTIFY_TAB_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar2, bool);
            if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC, false)) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, bool);
            }
        } else {
            this.f114478f.setText(C0966R.string.fac);
        }
        TabItemView tabItemView = (TabItemView) findViewById(C0966R.C0970id.kd8);
        this.f114479g = tabItemView;
        tabItemView.setShowType(1);
        TabItemView tabItemView2 = (TabItemView) findViewById(C0966R.C0970id.kd9);
        this.f114480h = tabItemView2;
        tabItemView2.setShowType(2);
        this.f114481i = (CustomViewPager) findViewById(C0966R.C0970id.gsy);
        C42322a aVar3 = new C42322a(getSupportFragmentManager());
        GameMsgCenterFragment gameMsgCenterFragment = new GameMsgCenterFragment();
        C42340c cVar = new C42340c(this, this.f114476d, this.f114477e == 1);
        this.f114482j = cVar;
        cVar.setNewMessageCount(this.f114484o);
        gameMsgCenterFragment.f114487d = this.f114482j;
        ((ArrayList) aVar3.f114488i).add(gameMsgCenterFragment);
        GameMsgCenterFragment gameMsgCenterFragment2 = new GameMsgCenterFragment();
        C42353j jVar = new C42353j(this, this.f114476d, this.f114477e == 2);
        this.f114483n = jVar;
        jVar.setNewMessageCount(this.f114485p);
        gameMsgCenterFragment2.f114487d = this.f114483n;
        ((ArrayList) aVar3.f114488i).add(gameMsgCenterFragment2);
        this.f114481i.setCanSlide(false);
        this.f114481i.setAdapter(aVar3);
        this.f114479g.setOnClickListener(new C42349f(this));
        this.f114480h.setOnClickListener(new C42350g(this));
        this.f114481i.setOnPageChangeListener(new C42351h(this));
        if (this.f114477e == 2) {
            this.f114479g.setUnreadCount(((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1));
            mo66395H7(1);
        } else {
            this.f114480h.setUnreadCount(((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(2));
            mo66395H7(0);
        }
        C41864d.m45384a(this);
    }

    public void onDestroy() {
        C42376x xVar;
        Cursor cursor;
        C42371w wVar;
        Cursor cursor2;
        super.onDestroy();
        C42340c cVar = this.f114482j;
        if (!(cVar == null || (wVar = cVar.f114550e) == null || (cursor2 = wVar.f114605A1.f114545e) == null)) {
            cursor2.close();
        }
        C42353j jVar = this.f114483n;
        if (!(jVar == null || (xVar = jVar.f114570e) == null || (cursor = xVar.f114630A1.f114545e) == null)) {
            cursor.close();
        }
        C41864d.m45388e(this);
        ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66007jo();
    }
}
