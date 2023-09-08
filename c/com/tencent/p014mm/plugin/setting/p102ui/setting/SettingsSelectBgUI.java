package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import p216op.C47389f;
import p216op.C47390g;
import p216op.C47392i;
import r41.C47926a;
import uc0.C52515a;
import uc0.C52516b;
import uc0.C52523w;
import uc0.C52524x;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI */
public class SettingsSelectBgUI extends MMActivity implements C11385n {

    /* renamed from: n */
    public static final /* synthetic */ int f116370n = 0;

    /* renamed from: d */
    public C42979c f116371d;

    /* renamed from: e */
    public GridView f116372e;

    /* renamed from: f */
    public C47390g f116373f;

    /* renamed from: g */
    public List<C47390g> f116374g = new ArrayList();

    /* renamed from: h */
    public boolean f116375h;

    /* renamed from: i */
    public String f116376i;

    /* renamed from: j */
    public MTimerHandler f116377j = new MTimerHandler(new C42977a(), true);

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI$a */
    public class C42977a implements MTimerHandler.CallBack {
        public C42977a() {
        }

        public boolean onTimerExpired() {
            if (SettingsSelectBgUI.this.findViewById(C0966R.C0970id.jf5).getWidth() <= 0) {
                return true;
            }
            SettingsSelectBgUI settingsSelectBgUI = SettingsSelectBgUI.this;
            int i = SettingsSelectBgUI.f116370n;
            settingsSelectBgUI.getClass();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) settingsSelectBgUI.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 >= i3) {
                i2 = i3;
            }
            settingsSelectBgUI.f116371d = new C42979c(settingsSelectBgUI, (i2 - 60) / 3);
            settingsSelectBgUI.f116372e = (GridView) settingsSelectBgUI.findViewById(C0966R.C0970id.jf5);
            ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU().add(settingsSelectBgUI.f116371d);
            settingsSelectBgUI.f116372e.setAdapter(settingsSelectBgUI.f116371d);
            settingsSelectBgUI.f116372e.setOnItemClickListener(new C42985f3(settingsSelectBgUI));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI$b */
    public class C42978b implements MenuItem.OnMenuItemClickListener {
        public C42978b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSelectBgUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI$c */
    public class C42979c extends C6975i1<C52523w> {

        /* renamed from: o */
        public Context f116380o;

        /* renamed from: p */
        public int f116381p;

        public C42979c(Context context, int i) {
            super(context, new C52523w());
            this.f116380o = context;
            this.f116381p = i;
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C52523w wVar = (C52523w) obj;
            if (wVar == null) {
                wVar = new C52523w();
            }
            wVar.mo73456a(cursor);
            return wVar;
        }

        public int getCount() {
            return mo7992g().getCount() + 2;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C42984e4 e4Var;
            Bitmap bitmap;
            Class cls = C47389f.class;
            if (view == null) {
                view = View.inflate(this.f116380o, C0966R.C0971layout.bxv, (ViewGroup) null);
                int i2 = this.f116381p;
                view.setLayoutParams(new AbsListView.LayoutParams(i2, i2));
                e4Var = new C42984e4();
                e4Var.f116389a = (LinearLayout) view.findViewById(C0966R.C0970id.j98);
                e4Var.f116390b = (LinearLayout) view.findViewById(C0966R.C0970id.j97);
                e4Var.f116391c = (LinearLayout) view.findViewById(C0966R.C0970id.j9b);
                e4Var.f116392d = (LinearLayout) view.findViewById(C0966R.C0970id.j9c);
                e4Var.f116393e = (LinearLayout) view.findViewById(C0966R.C0970id.j96);
                view.setTag(e4Var);
            } else {
                e4Var = (C42984e4) view.getTag();
            }
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12311, (Object) null), -2);
            C52515a jo = ((C52516b) ((C47389f) C86312j.m106911c(cls)).Bk0()).mo73451jo(SettingsSelectBgUI.this.f116376i);
            if (i == 0) {
                boolean z = SettingsSelectBgUI.this.f116375h;
                if ((!z || nullAs != -2) && (!(!z && nullAs == -2 && jo == null) && (jo == null || jo.f146672b != -2))) {
                    e4Var.mo67190a("downloaded");
                } else {
                    e4Var.mo67190a("using");
                }
                ((ImageView) view.findViewById(C0966R.C0970id.j9_)).setImageBitmap(BitmapUtil.getRoundedCornerBitmap(BitmapFactory.decodeResource(this.f116380o.getResources(), C0966R.C0969drawable.bev), true, 10.0f));
                return view;
            } else if (i == 1) {
                boolean z2 = SettingsSelectBgUI.this.f116375h;
                if ((!z2 || nullAs != 0) && (!(!z2 && nullAs == 0 && jo == null) && (jo == null || jo.f146672b != 0))) {
                    e4Var.mo67190a("downloaded");
                } else {
                    e4Var.mo67190a("using");
                }
                ((ImageView) view.findViewById(C0966R.C0970id.j9_)).setImageBitmap(BitmapUtil.getRoundedCornerBitmap(BitmapFactory.decodeResource(this.f116380o.getResources(), C0966R.C0969drawable.beu), true, 10.0f));
                return view;
            } else {
                C52523w wVar = (C52523w) getItem(i - 2);
                C47392i SU = ((C47389f) C86312j.m106911c(cls)).mo72331SU();
                if (!C86709a0.m107535s().mo121147n()) {
                    bitmap = BitmapFactory.decodeResource(SettingsSelectBgUI.this.getResources(), C0966R.C0969drawable.bit);
                } else {
                    StringBuilder sb = new StringBuilder();
                    C52524x xVar = (C52524x) SU;
                    xVar.getClass();
                    sb.append(C47926a.m53249a());
                    int i3 = wVar.f146696a;
                    int i4 = wVar.f146702g;
                    xVar.getClass();
                    sb.append(i3 + "_" + i4 + "_thumb.jpg");
                    bitmap = BitmapUtil.getBitmapNative(sb.toString());
                }
                if (bitmap == null) {
                    int i5 = wVar.f146696a;
                    int i6 = wVar.f146702g;
                    C52524x xVar2 = (C52524x) SU;
                    C91753f fVar = xVar2.f146709d;
                    if (fVar.delete("packageinfo2", "id= ? and type =?", new String[]{"" + i5, "" + i6}) > 0) {
                        xVar2.doNotify();
                    }
                    return view;
                }
                ((ImageView) view.findViewById(C0966R.C0970id.j9_)).setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, true, 10.0f));
                int i7 = wVar.f146701f;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            e4Var.mo67190a("downloading");
                        } else if (i7 == 4) {
                            e4Var.mo67190a("canceling");
                        } else if (i7 == 5) {
                            e4Var.mo67190a("undownloaded");
                        }
                    } else if (SettingsSelectBgUI.this.f116375h || jo == null || jo.f146672b != wVar.f146696a) {
                        e4Var.mo67190a("downloaded");
                    } else {
                        e4Var.mo67190a("using");
                    }
                } else if (SettingsSelectBgUI.this.f116375h || jo == null || jo.f146672b == wVar.f146696a) {
                    e4Var.mo67190a("using");
                } else {
                    e4Var.mo67190a("downloaded");
                }
                return view;
            }
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            C52524x xVar = (C52524x) ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU();
            xVar.getClass();
            mo7998r(xVar.f146709d.rawQuery("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1", (String[]) null));
            notifyDataSetChanged();
        }
    }

    /* renamed from: H7 */
    public static void m46635H7(SettingsSelectBgUI settingsSelectBgUI, int i) {
        settingsSelectBgUI.getClass();
        Class cls = C47389f.class;
        C86709a0.m107535s().mo121142i().mo119676J(66820, Integer.valueOf(i));
        C115669n.INSTANCE.mo160131h(10198, Integer.valueOf(i));
        Log.m105925i("MicroMsg.SettingsSelectBgUI", "set chating bg id:%d", Integer.valueOf(i));
        if (settingsSelectBgUI.f116375h) {
            C86709a0.m107535s().mo121142i().mo119676J(12311, Integer.valueOf(i));
            ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73467jo(1);
            return;
        }
        C52516b bVar = (C52516b) ((C47389f) C86312j.m106911c(cls)).Bk0();
        C52515a jo = bVar.mo73451jo(settingsSelectBgUI.f116376i);
        if (jo == null) {
            C52515a aVar = new C52515a();
            aVar.f146671a = settingsSelectBgUI.f116376i;
            aVar.f146672b = i;
            bVar.mo73450Lo(aVar);
            return;
        }
        jo.f146672b = i;
        bVar.mo73452qq(jo);
    }

    /* renamed from: I7 */
    public final void mo67185I7(List<C47390g> list) {
        if (list.size() > 0) {
            this.f116373f = list.remove(0);
            C86709a0.m107524d().mo123460f((C117747y) this.f116373f);
            return;
        }
        this.f116373f = null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxu;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ir8);
        setBackBtn(new C42978b());
        this.f116375h = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f116376i = getIntent().getStringExtra("username");
        this.f116377j.startTimer(20);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        if (getBounceView() != null) {
            getBounceView().setBg(getResources().getDrawable(C0966R.C0969drawable.bl6));
        }
        C86709a0.m107524d().mo123455a(159, this);
        C86709a0.m107524d().mo123455a(160, this);
        if (C86709a0.m107535s().mo121147n()) {
            C86709a0.m107524d().mo123460f((C117747y) ((C47389f) C86312j.m106911c(C47389f.class)).mo72332TD(1));
        }
    }

    public void onDestroy() {
        Class cls = C47389f.class;
        super.onDestroy();
        if (this.f116373f != null) {
            C86709a0.m107524d().mo123458d((C117747y) this.f116373f);
            ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73462SE(this.f116373f.mo72417z(), 1);
        }
        ArrayList arrayList = (ArrayList) this.f116374g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73462SE(((C47390g) it.next()).mo72417z(), 1);
        }
        arrayList.clear();
        C86709a0.m107524d().mo123470p(159, this);
        C86709a0.m107524d().mo123470p(160, this);
        this.f116371d.mo5580b();
        ((C47389f) C86312j.m106911c(cls)).mo72331SU().remove(this.f116371d);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47349a0) || ((C47349a0) yVar).mo72393j() != 1) {
            Log.m105918d("MicroMsg.SettingsSelectBgUI", "another scene");
            return;
        }
        int type = yVar.getType();
        if ((type == 159 || type == 160) && type == 160) {
            mo67185I7(this.f116374g);
        }
    }
}
