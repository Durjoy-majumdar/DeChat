package com.tencent.p014mm.plugin.readerapp.p092ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C75584h4;
import eb0.C75586j4;
import eb0.C86493v0;
import ex0.C45696d;
import ex0.C45700h;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20937c;
import hg2.C76193l;
import hg2.C98451e;
import ic0.C98661k;
import ig2.C76350a;
import ig2.C76358c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kw0.C46746a;
import l31.C61212e;
import nj3.C11184p0;
import o31.C11345b;
import o31.C76986a;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import p1081gi.C98121d;
import p1162x2.C112019a;
import p214om.C11502f;
import p243tn.C14050a;
import p385u2.C111105a;
import uo3.C78253a;
import vd3.C78404m;
import vo3.C90852c;
import wd3.C22898h;
import wd3.C22906q;
import wd3.C22908r;
import wd3.C22909x0;
import zh3.C91753f;

@C86737h0
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI */
public class ReaderAppUI extends MMActivity {

    /* renamed from: v */
    public static float f203388v;

    /* renamed from: d */
    public C72917n0 f203389d;

    /* renamed from: e */
    public MMPullDownView f203390e;

    /* renamed from: f */
    public View f203391f;

    /* renamed from: g */
    public C76350a<String> f203392g;

    /* renamed from: h */
    public int f203393h = 0;

    /* renamed from: i */
    public int f203394i = 0;

    /* renamed from: j */
    public String f203395j = "";

    /* renamed from: n */
    public String f203396n = "";

    /* renamed from: o */
    public C78404m f203397o = null;

    /* renamed from: p */
    public int f203398p = 0;

    /* renamed from: q */
    public C78253a f203399q;

    /* renamed from: r */
    public TextView f203400r;

    /* renamed from: s */
    public TextView f203401s;

    /* renamed from: t */
    public LinearLayout f203402t;

    /* renamed from: u */
    public C11184p0 f203403u = new C70404e();

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$a */
    public class C70400a implements View.OnClickListener {
        public C70400a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ReaderAppUI.this.f203394i = 19;
            C115669n.INSTANCE.mo160131h(15413, 19, "", "", "", "", "", 0, 0, ReaderAppUI.this.f203395j);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://view.inews.qq.com/pluginHot?scene=weixin");
            intent.putExtra("geta8key_scene", 79);
            C88144b.m109791i(ReaderAppUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$b */
    public class C70401b implements View.OnClickListener {
        public C70401b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ReaderAppUI.this.f203394i = 20;
            C115669n.INSTANCE.mo160131h(15413, 20, "", "", "", "", "", 0, 0, ReaderAppUI.this.f203395j);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://view.inews.qq.com/plugin724?scene=weixin");
            intent.putExtra("geta8key_scene", 79);
            C88144b.m109791i(ReaderAppUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$c */
    public class C70402c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f203406d;

        /* renamed from: e */
        public final /* synthetic */ String f203407e;

        /* renamed from: f */
        public final /* synthetic */ C75584h4 f203408f;

        /* renamed from: g */
        public final /* synthetic */ int f203409g;

        public C70402c(int i, String str, C75584h4 h4Var, int i2) {
            this.f203406d = i;
            this.f203407e = str;
            this.f203408f = h4Var;
            this.f203409g = i2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (20 == this.f203406d) {
                C115669n.INSTANCE.mo160131h(15413, 8, this.f203407e, this.f203408f.mo105924f());
                Intent intent = new Intent();
                intent.putExtra("mode", 1);
                String h = this.f203408f.mo105926h();
                intent.putExtra("news_svr_id", this.f203408f.f222051p);
                intent.putExtra("news_svr_tweetid", this.f203408f.mo105925g());
                intent.putExtra("rawUrl", ReaderAppUI.m82959H7(ReaderAppUI.this, h));
                String str = this.f203408f.f222039d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
                intent.putExtra("webpageTitle", this.f203408f.mo105924f());
                intent.putExtra("key_show_web_page_title", true);
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                Bundle bundle = new Bundle();
                bundle.putInt("snsWebSource", 3);
                intent.putExtra("jsapiargs", bundle);
                String str3 = this.f203408f.f222042g;
                if (str3 != null) {
                    str2 = str3;
                }
                intent.putExtra("shortUrl", str2);
                intent.putExtra("type", this.f203408f.f222038c);
                intent.putExtra("tweetid", this.f203408f.mo105925g());
                intent.putExtra("geta8key_username", "newsapp");
                intent.putExtra("KPublisherId", "msg_" + Long.toString(this.f203408f.f222051p));
                intent.putExtra("pre_username", "newsapp");
                intent.putExtra("prePublishId", "msg_" + Long.toString(this.f203408f.f222051p));
                intent.putExtra("preUsername", "newsapp");
                intent.putExtra("preChatName", "newsapp");
                intent.putExtra("preMsgIndex", this.f203409g);
                intent.putExtra("geta8key_scene", 66);
                intent.putExtra("webview_scene_type", 1);
                C75584h4 h4Var = this.f203408f;
                h4Var.mo105927i();
                C75584h4 h4Var2 = this.f203408f;
                h4Var2.mo105927i();
                C75584h4 h4Var3 = this.f203408f;
                h4Var3.mo105927i();
                intent.putExtra("webview_scene_note", WebViewUtilities.doUrlEncode(String.format("%d|%d|%s|%s|%s", new Object[]{Integer.valueOf(h4Var.f222057v), Integer.valueOf(h4Var2.f222056u), h4Var3.f222058w, this.f203407e, this.f203408f.mo105925g()})));
                intent.putExtra("bizEnterId", (int) (System.currentTimeMillis() / 1000));
                intent.putExtra("KOpenArticleSceneFromScene", 0);
                intent.addFlags(536870912);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, ReaderAppUI.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$d */
    public class C70403d implements Runnable {
        public C70403d() {
        }

        public void run() {
            ReaderAppUI readerAppUI = ReaderAppUI.this;
            ((C70411l) readerAppUI.f203392g).mo96992u(readerAppUI.f203389d.getFirstVisiblePosition(), ReaderAppUI.this.f203389d.getLastVisiblePosition());
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$e */
    public class C70404e implements C11184p0 {
        public C70404e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int groupId = menuItem.getGroupId();
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                ReaderAppUI readerAppUI = ReaderAppUI.this;
                if (readerAppUI.f203393h == 20) {
                    ArrayList arrayList = (ArrayList) C76193l.yx0().mo105931Yt(((C70411l) readerAppUI.f203392g).getItem(groupId), ReaderAppUI.this.f203393h);
                    if (arrayList.size() > 0) {
                        C75584h4 h4Var = (C75584h4) arrayList.get(0);
                        C68070l.C68072b bVar = new C68070l.C68072b();
                        bVar.f195570f = h4Var.mo105924f();
                        bVar.f195574g = h4Var.mo105923d();
                        bVar.f195578h = "view";
                        bVar.f195582i = 5;
                        bVar.f195586j = h4Var.mo105926h();
                        String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                        Intent intent = new Intent();
                        intent.putExtra("Retr_Msg_content", s);
                        intent.putExtra("Retr_Msg_Type", 2);
                        intent.putExtra("Retr_Msg_thumb_path", C14050a.m13405b(h4Var.mo105922c()));
                        intent.putExtra("Retr_Msg_Id", 7377812);
                        String a = C86493v0.m107223a("" + h4Var.f222051p);
                        intent.putExtra("reportSessionId", a);
                        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                        c.mo120962i("prePublishId", "msg_" + h4Var.f222051p);
                        c.mo120962i("preUsername", "newsapp");
                        c.mo120962i("preChatName", "newsapp");
                        c.mo120962i("preMsgIndex", 0);
                        c.mo120962i("sendAppMsgScene", 1);
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93184q(intent, ReaderAppUI.this);
                    }
                }
            } else if (itemId == 1) {
                ReaderAppUI readerAppUI2 = ReaderAppUI.this;
                if (readerAppUI2.f203393h == 20) {
                    String x = ((C70411l) readerAppUI2.f203392g).getItem(groupId);
                    ArrayList arrayList2 = (ArrayList) C76193l.yx0().mo105931Yt(x, ReaderAppUI.this.f203393h);
                    if (!arrayList2.isEmpty()) {
                        Log.m105925i("MicroMsg.ReaderAppUI", "fav functionId %s, index %d, size %d", x, Integer.valueOf(ReaderAppUI.this.f203398p), Integer.valueOf(arrayList2.size()));
                        if (ReaderAppUI.this.f203398p >= arrayList2.size()) {
                            ReaderAppUI.this.f203398p = 0;
                        }
                        C75584h4 h4Var2 = (C75584h4) arrayList2.get(ReaderAppUI.this.f203398p);
                        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                        String a2 = C86493v0.m107223a("" + h4Var2.f222051p);
                        C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(a2, true);
                        c2.mo120962i("prePublishId", "msg_" + h4Var2.f222051p);
                        c2.mo120962i("preUsername", "newsapp");
                        c2.mo120962i("preChatName", "newsapp");
                        c2.mo120962i("preMsgIndex", 0);
                        c2.mo120962i("sendAppMsgScene", 1);
                        doFavoriteEvent.f264674d.f264683h = a2;
                        C98451e.m127894a(doFavoriteEvent, h4Var2, ReaderAppUI.this.f203398p);
                        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                        aVar.f264688m = 7;
                        aVar.f264684i = ReaderAppUI.this;
                        doFavoriteEvent.publish();
                    }
                }
            } else if (itemId == 2) {
                String x2 = ((C70411l) ReaderAppUI.this.f203392g).getItem(groupId);
                if (!Util.isNullOrNil(x2)) {
                    int i2 = ReaderAppUI.this.f203393h;
                    C76193l.xx0(C76193l.yx0().mo105931Yt(x2, i2), i2);
                    C75586j4 yx02 = C76193l.yx0();
                    int i3 = ReaderAppUI.this.f203393h;
                    yx02.getClass();
                    String str = "delete from " + yx02.mo105933kD(i3) + " where " + "reserved3" + " = " + C91753f.m115264e(x2);
                    Log.m105919d("MicroMsg.ReaderAppInfoStorage", "deleteGroup:%s", str);
                    if (yx02.f222063d.execSQL(yx02.mo105933kD(i3), str)) {
                        yx02.mo105930SE(i3);
                        yx02.doNotify();
                    }
                }
                ReaderAppUI.this.mo96978J7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$f */
    public class C70405f implements MMPullDownView.C73180h {
        public C70405f() {
        }

        /* renamed from: a */
        public boolean mo96020a() {
            int i;
            if (ReaderAppUI.this.f203392g.mo96991t()) {
                ReaderAppUI readerAppUI = ReaderAppUI.this;
                readerAppUI.f203389d.setSelectionFromTop(0, readerAppUI.f203390e.getTopHeight());
                return true;
            }
            int count = ReaderAppUI.this.f203392g.getCount();
            C70411l lVar = (C70411l) ReaderAppUI.this.f203392g;
            if (lVar.mo96991t()) {
                i = 0;
            } else {
                i = 3;
                int i2 = lVar.f203422p + 3;
                lVar.f203422p = i2;
                int i3 = lVar.f203423q;
                if (i2 > i3) {
                    lVar.f203422p = i3;
                    i = i3 % 3;
                }
            }
            Log.m105926v("MicroMsg.ReaderAppUI", "onLoadData add count:" + i);
            ReaderAppUI.this.f203392g.mo7991f();
            int count2 = ReaderAppUI.this.f203392g.getCount();
            Log.m105919d("MicroMsg.ReaderAppUI", "onTopLoadData nowCount:%d, preCount:%d", Integer.valueOf(count2), Integer.valueOf(count));
            if (count2 > count) {
                int i4 = i + 1;
                Log.m105925i("MicroMsg.ReaderAppUI", "pullDownView nowCount > preCount on set position %d, set pullDownView.getTopHeight() %d", Integer.valueOf(i4), Integer.valueOf(ReaderAppUI.this.f203390e.getTopHeight()));
                ReaderAppUI readerAppUI2 = ReaderAppUI.this;
                C72924q1.m85521b(readerAppUI2.f203389d, i4, readerAppUI2.f203390e.getTopHeight(), false, false);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$g */
    public class C70406g implements MMPullDownView.C73177d {
        public C70406g() {
        }

        /* renamed from: q0 */
        public boolean mo64384q0() {
            C72917n0 n0Var = ReaderAppUI.this.f203389d;
            View childAt = n0Var.getChildAt(n0Var.getChildCount() - 1);
            return childAt != null && childAt.getBottom() <= ReaderAppUI.this.f203389d.getHeight() && ReaderAppUI.this.f203389d.getLastVisiblePosition() == ReaderAppUI.this.f203389d.mo81303l().getCount() - 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$h */
    public class C70407h implements MMPullDownView.C73178e {
        public C70407h() {
        }

        /* renamed from: b0 */
        public boolean mo64386b0() {
            C72917n0 n0Var = ReaderAppUI.this.f203389d;
            View childAt = n0Var.getChildAt(n0Var.getFirstVisiblePosition());
            return childAt != null && childAt.getTop() == 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$i */
    public class C70408i implements C6975i1.C6977b {
        public C70408i() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            ReaderAppUI readerAppUI = ReaderAppUI.this;
            readerAppUI.f203390e.setIsTopShowAll(readerAppUI.f203392g.mo96991t());
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$j */
    public class C70409j implements MenuItem.OnMenuItemClickListener {
        public C70409j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ReaderAppUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$k */
    public class C70410k implements MenuItem.OnMenuItemClickListener {
        public C70410k() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(new Intent().putExtra("Contact_User", ReaderAppUI.this.f203396n).putExtra("reportSessionId", ReaderAppUI.this.f203395j), ReaderAppUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$l */
    public class C70411l extends C76350a<String> {

        /* renamed from: A */
        public int f203419A = 2;

        /* renamed from: o */
        public Context f203421o;

        /* renamed from: p */
        public int f203422p;

        /* renamed from: q */
        public int f203423q;

        /* renamed from: r */
        public int f203424r = 0;

        /* renamed from: s */
        public int f203425s = 0;

        /* renamed from: t */
        public int f203426t = 0;

        /* renamed from: u */
        public int f203427u = 0;

        /* renamed from: v */
        public int f203428v = 0;

        /* renamed from: w */
        public int f203429w = 0;

        /* renamed from: x */
        public int f203430x;

        /* renamed from: y */
        public int f203431y;

        /* renamed from: z */
        public int f203432z = 1;

        /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$l$a */
        public final class C70412a {

            /* renamed from: a */
            public View f203433a;

            /* renamed from: b */
            public TextView f203434b;

            /* renamed from: c */
            public View f203435c;

            /* renamed from: d */
            public ImageView f203436d;

            /* renamed from: e */
            public View f203437e;

            /* renamed from: f */
            public View f203438f;

            public C70412a(C70411l lVar) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$l$b */
        public final class C70413b {

            /* renamed from: a */
            public TextView f203439a;

            /* renamed from: b */
            public TextView f203440b;

            /* renamed from: c */
            public View f203441c;

            /* renamed from: d */
            public View f203442d;

            /* renamed from: e */
            public ImageView f203443e;

            /* renamed from: f */
            public TextView f203444f;

            /* renamed from: g */
            public View f203445g;

            /* renamed from: h */
            public ViewGroup f203446h;

            /* renamed from: i */
            public MMNeat7extView f203447i;

            /* renamed from: j */
            public ImageView f203448j;

            /* renamed from: k */
            public ImageView f203449k;

            /* renamed from: l */
            public List<C70412a> f203450l;

            /* renamed from: m */
            public ImageView f203451m;

            /* renamed from: n */
            public TextView f203452n;

            /* renamed from: o */
            public C70414c f203453o;

            /* renamed from: p */
            public C70414c f203454p;

            public C70413b(C70411l lVar) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$l$c */
        public final class C70414c {

            /* renamed from: a */
            public View f203455a;

            /* renamed from: b */
            public View f203456b;

            /* renamed from: c */
            public View f203457c;

            /* renamed from: d */
            public ImageView f203458d;

            /* renamed from: e */
            public ImageView f203459e;

            /* renamed from: f */
            public MMNeat7extView f203460f;

            /* renamed from: g */
            public TextView f203461g;

            /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI$l$c$a */
            public class C70415a implements C22906q.C22907a {
                public C70415a() {
                }

                public void onFinish() {
                    C70414c cVar = C70414c.this;
                    cVar.f203460f.setTextColor(ReaderAppUI.this.getContext().getResources().getColor(C0966R.color.al_));
                    C70414c.this.f203457c.setBackgroundResource(C0966R.C0969drawable.f357432b32);
                }

                public void onStart() {
                }
            }

            public C70414c() {
            }

            /* renamed from: a */
            public void mo96996a(C75584h4 h4Var, int i, String str) {
                ReaderAppUI readerAppUI = ReaderAppUI.this;
                View.OnClickListener I7 = readerAppUI.mo96977I7(h4Var, readerAppUI.f203393h, i, 0, str);
                View view = this.f203455a;
                if (view != null) {
                    view.setOnClickListener(I7);
                    this.f203455a.setTag(Integer.valueOf(i));
                    this.f203455a.setTag(C0966R.C0970id.idn, Integer.valueOf(i));
                    ReaderAppUI readerAppUI2 = ReaderAppUI.this;
                    readerAppUI2.f203399q.mo108274i(this.f203455a, new C76358c(readerAppUI2, false), readerAppUI2.f203403u);
                    this.f203460f.mo104279b(h4Var.mo105924f());
                    h4Var.mo105927i();
                    String d = C92721n.m116876d(h4Var.f222055t);
                    if (!Util.isNullOrNil(d)) {
                        this.f203461g.setText(d);
                        View view2 = this.f203456b;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view4 = this.f203456b;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f203460f.setTextColor(ReaderAppUI.this.getContext().getResources().getColor(C0966R.color.a18));
                    this.f203457c.setBackgroundResource(C0966R.C0969drawable.ags);
                    int textSize = (int) (((double) this.f203461g.getTextSize()) * 1.7d);
                    ViewGroup.LayoutParams layoutParams = this.f203459e.getLayoutParams();
                    layoutParams.height = textSize;
                    layoutParams.width = textSize;
                    this.f203459e.setLayoutParams(layoutParams);
                    C70411l lVar = C70411l.this;
                    ImageView imageView = this.f203458d;
                    int i2 = lVar.f203429w;
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    layoutParams2.height = i2;
                    imageView.setLayoutParams(layoutParams2);
                    C70411l lVar2 = C70411l.this;
                    String c = h4Var.mo105922c();
                    ImageView imageView2 = this.f203458d;
                    C70415a aVar3 = new C70415a();
                    lVar2.getClass();
                    String d2 = C92856r0.m117118d(c);
                    int f = (int) ((((float) C46746a.f125826a.mo71973f(ReaderAppUI.this.getContext())) - (ReaderAppUI.f203388v * 52.0f)) / 2.0f);
                    float dimensionPixelSize = (float) imageView2.getResources().getDimensionPixelSize(C0966R.dimen.al6);
                    C20828a b = C20828a.m22825b();
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59361q = C0966R.C0969drawable.f4571gc;
                    bVar.f59346b = true;
                    bVar.f59344B = "reader_weishi";
                    int i3 = lVar2.f203429w;
                    bVar.f59354j = f;
                    bVar.f59355k = i3;
                    bVar.f59369y = new C22908r(0);
                    bVar.f59370z = new C22898h(0);
                    bVar.f59350f = C14050a.m13405b(d2);
                    b.mo32522k(d2, imageView2, bVar.mo32666a(), (C98661k) null, new C22906q(0, f, lVar2.f203429w, true, true, dimensionPixelSize, aVar3));
                }
            }

            /* renamed from: b */
            public void mo96997b() {
                View view = this.f203455a;
                if (view != null) {
                    this.f203458d = (ImageView) view.findViewById(C0966R.C0970id.lov);
                    ImageView imageView = (ImageView) this.f203455a.findViewById(C0966R.C0970id.i1x);
                    this.f203460f = (MMNeat7extView) this.f203455a.findViewById(C0966R.C0970id.kpj);
                    this.f203461g = (TextView) this.f203455a.findViewById(C0966R.C0970id.l4l);
                    this.f203459e = (ImageView) this.f203455a.findViewById(C0966R.C0970id.f358929hx2);
                    this.f203456b = this.f203455a.findViewById(C0966R.C0970id.hxb);
                    this.f203457c = this.f203455a.findViewById(C0966R.C0970id.los);
                }
            }
        }

        public C70411l(Context context, String str) {
            super(context, str);
            this.f203421o = context;
            this.f203422p = 3;
            this.f203423q = C76193l.yx0().mo105934qq(ReaderAppUI.this.f203393h);
            this.f203425s = context.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            this.f203426t = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            this.f203424r = context.getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
            this.f203427u = context.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
            this.f203430x = context.getResources().getDimensionPixelSize(C0966R.dimen.f4274yb);
            this.f203431y = context.getResources().getDimensionPixelSize(C0966R.dimen.f4272y_);
            int f = C46746a.f125826a.mo71973f(context);
            int j = C76577a.m92159j(context);
            f = f >= j ? j : f;
            float f2 = ReaderAppUI.f203388v;
            this.f203428v = (int) (((double) (f - ((int) (28.0f * f2)))) / 2.35d);
            this.f203429w = (((int) ((((float) f) - (f2 * 52.0f)) / 2.0f)) * 4) / 3;
        }

        /* renamed from: A */
        public List<C75584h4> mo96985A(int i) {
            return C76193l.yx0().mo105931Yt(getItem(i), 20);
        }

        /* renamed from: c3 */
        public void mo81320c3(Object obj) {
            notifyDataSetChanged();
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            String str = (String) obj;
            return cursor.getString(0);
        }

        public int getItemViewType(int i) {
            List<C75584h4> A = mo96985A(i);
            if (Util.isNullOrNil((List) A)) {
                Log.m105920e("MicroMsg.ReaderAppUI", "getItemViewType info is null");
                return 0;
            }
            ArrayList arrayList = (ArrayList) A;
            C75584h4 h4Var = (C75584h4) arrayList.get(0);
            h4Var.mo105927i();
            boolean z = true;
            if (h4Var.f222056u != 1) {
                z = false;
            }
            if (!z || arrayList.size() < 2) {
                return 0;
            }
            return this.f203432z;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C70413b bVar;
            View view2;
            View view3;
            ArrayList arrayList;
            int i2;
            int i3;
            View view4;
            C70413b bVar2;
            int i4 = i;
            if (getItemViewType(i) == this.f203432z) {
                if (view == null) {
                    bVar2 = new C70413b(this);
                    view4 = View.inflate(this.f203421o, C0966R.C0971layout.bpl, (ViewGroup) null);
                    bVar2.f203439a = (TextView) view4.findViewById(C0966R.C0970id.low);
                    bVar2.f203451m = (ImageView) view4.findViewById(C0966R.C0970id.a27);
                    bVar2.f203452n = (TextView) view4.findViewById(C0966R.C0970id.hfq);
                    C70414c cVar = new C70414c();
                    bVar2.f203453o = cVar;
                    cVar.f203455a = view4.findViewById(C0966R.C0970id.buw);
                    bVar2.f203453o.mo96997b();
                    C70414c cVar2 = new C70414c();
                    bVar2.f203454p = cVar2;
                    cVar2.f203455a = view4.findViewById(C0966R.C0970id.bux);
                    bVar2.f203454p.mo96997b();
                    view4.setTag(bVar2);
                } else {
                    bVar2 = (C70413b) view.getTag();
                    view4 = view;
                }
                ArrayList arrayList2 = (ArrayList) mo96985A(i);
                if (arrayList2.size() >= 2) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C75584h4 h4Var = (C75584h4) arrayList2.get(0);
                    bVar2.f203439a.setText(C72715f.m85112e(this.f203421o, h4Var.f222037b, false));
                    C20937c.C20939b bVar3 = new C20937c.C20939b();
                    bVar3.f59361q = C0966R.C0969drawable.be5;
                    bVar3.f59347c = true;
                    bVar3.f59364t = true;
                    C20828a b = C20828a.m22825b();
                    String str = h4Var.f222046k;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    b.mo32519h(str, bVar2.f203451m, bVar3.mo32666a());
                    TextView textView = bVar2.f203452n;
                    String str3 = h4Var.f222045j;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    textView.setText(str2);
                    bVar2.f203452n.getPaint().setFakeBoldText(true);
                    C78404m mVar = ReaderAppUI.this.f203397o;
                    if (mVar != null) {
                        bVar2.f203439a.setTextColor(mVar.f229734a);
                        C78404m mVar2 = ReaderAppUI.this.f203397o;
                        if (mVar2.f229735b) {
                            bVar2.f203439a.setShadowLayer(2.0f, 1.2f, 1.2f, mVar2.f229736c);
                        } else {
                            bVar2.f203439a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        }
                        if (ReaderAppUI.this.f203397o.f229737d) {
                            bVar2.f203439a.setBackgroundResource(C0966R.C0969drawable.f4746lo);
                            TextView textView2 = bVar2.f203439a;
                            int i5 = this.f203425s;
                            int i6 = this.f203424r;
                            textView2.setPadding(i5, i6, i5, i6);
                        } else {
                            bVar2.f203439a.setBackgroundColor(0);
                        }
                    }
                    bVar2.f203453o.mo96996a(h4Var, i4, h4Var.mo105924f());
                    bVar2.f203454p.mo96996a((C75584h4) arrayList2.get(1), i4, h4Var.mo105924f());
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view6 = view4;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return view4;
            }
            if (view == null) {
                C70413b bVar4 = new C70413b(this);
                View inflate = View.inflate(this.f203421o, C0966R.C0971layout.bpk, (ViewGroup) null);
                bVar4.f203439a = (TextView) inflate.findViewById(C0966R.C0970id.idk);
                bVar4.f203446h = (ViewGroup) inflate.findViewById(C0966R.C0970id.idf);
                bVar4.f203442d = inflate.findViewById(C0966R.C0970id.agk);
                bVar4.f203441c = inflate.findViewById(C0966R.C0970id.buv);
                bVar4.f203449k = (ImageView) inflate.findViewById(C0966R.C0970id.i1x);
                bVar4.f203448j = (ImageView) inflate.findViewById(C0966R.C0970id.bve);
                bVar4.f203440b = (TextView) inflate.findViewById(C0966R.C0970id.idl);
                bVar4.f203443e = (ImageView) inflate.findViewById(C0966R.C0970id.idj);
                bVar4.f203444f = (TextView) inflate.findViewById(C0966R.C0970id.idi);
                bVar4.f203445g = inflate.findViewById(C0966R.C0970id.kqy);
                bVar4.f203447i = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.kpj);
                bVar4.f203450l = new ArrayList();
                inflate.setTag(bVar4);
                bVar = bVar4;
                view2 = inflate;
            } else {
                view2 = view;
                bVar = (C70413b) view.getTag();
            }
            Iterator it = ((ArrayList) bVar.f203450l).iterator();
            while (it.hasNext()) {
                bVar.f203446h.removeView(((C70412a) it.next()).f203433a);
            }
            ((ArrayList) bVar.f203450l).clear();
            List<C75584h4> A = mo96985A(i);
            ArrayList arrayList3 = (ArrayList) A;
            if (arrayList3.size() > 0) {
                int size = arrayList3.size();
                C75584h4 h4Var2 = (C75584h4) arrayList3.get(0);
                ArrayList arrayList4 = arrayList3;
                bVar.f203439a.setText(C72715f.m85112e(this.f203421o, h4Var2.f222037b, false));
                C78404m mVar3 = ReaderAppUI.this.f203397o;
                if (mVar3 != null) {
                    bVar.f203439a.setTextColor(mVar3.f229734a);
                    C78404m mVar4 = ReaderAppUI.this.f203397o;
                    if (mVar4.f229735b) {
                        bVar.f203439a.setShadowLayer(2.0f, 1.2f, 1.2f, mVar4.f229736c);
                    } else {
                        bVar.f203439a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    if (ReaderAppUI.this.f203397o.f229737d) {
                        bVar.f203439a.setBackgroundResource(C0966R.C0969drawable.f4746lo);
                        TextView textView3 = bVar.f203439a;
                        int i7 = this.f203425s;
                        int i8 = this.f203424r;
                        textView3.setPadding(i7, i8, i7, i8);
                    } else {
                        bVar.f203439a.setBackgroundColor(0);
                    }
                }
                ReaderAppUI readerAppUI = ReaderAppUI.this;
                C75584h4 h4Var3 = h4Var2;
                int i9 = size;
                arrayList = arrayList4;
                bVar.f203445g.setOnClickListener(readerAppUI.mo96977I7(h4Var3, readerAppUI.f203393h, i, 0, h4Var2.mo105924f()));
                boolean z = i9 == 1;
                bVar.f203440b.setText(h4Var3.mo105924f());
                bVar.f203444f.setText(h4Var3.mo105923d());
                boolean z2 = !Util.isNullOrNil(h4Var3.mo105922c());
                bVar.f203447i.mo104279b(h4Var3.mo105924f());
                bVar.f203444f.setVisibility((!z || Util.isNullOrNil(h4Var3.mo105923d())) ? 8 : 0);
                bVar.f203448j.setVisibility(8);
                if (z) {
                    bVar.f203449k.setBackgroundResource(C0966R.C0969drawable.f4805ne);
                    View view7 = bVar.f203442d;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar.f203447i.setVisibility(8);
                    bVar.f203440b.setVisibility(0);
                } else {
                    bVar.f203449k.setBackgroundResource(C0966R.C0969drawable.f4806nf);
                    View view9 = bVar.f203442d;
                    int i15 = z2 ? 8 : 0;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(Integer.valueOf(i15));
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar.f203440b.setVisibility(8);
                    bVar.f203447i.setVisibility(0);
                    bVar.f203447i.setTextColor(ReaderAppUI.this.getContext().getResources().getColor(C0966R.color.a18));
                    bVar.f203447i.setBackgroundResource(C0966R.C0969drawable.ags);
                    bVar.f203447i.getPaint().setFakeBoldText(true);
                }
                ImageView imageView = bVar.f203449k;
                int i16 = this.f203428v;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.height = i16;
                imageView.setLayoutParams(layoutParams);
                View view11 = bVar.f203441c;
                int i17 = this.f203428v;
                ViewGroup.LayoutParams layoutParams2 = view11.getLayoutParams();
                layoutParams2.height = i17;
                view11.setLayoutParams(layoutParams2);
                if (z2) {
                    View view12 = bVar.f203441c;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view13 = view12;
                    C117292a.m165358d(view13, aVar5.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    String c = h4Var3.mo105922c();
                    ImageView imageView2 = bVar.f203443e;
                    int i18 = this.f203428v;
                    C70416a aVar6 = new C70416a(this, z, bVar);
                    String d = C92856r0.m117118d(c);
                    int f = C46746a.f125826a.mo71973f(ReaderAppUI.this.getContext()) - ((int) (ReaderAppUI.f203388v * 28.0f));
                    C20828a b2 = C20828a.m22825b();
                    C20937c.C20939b bVar5 = new C20937c.C20939b();
                    bVar5.f59361q = C0966R.C0969drawable.f4570gb;
                    bVar5.f59346b = true;
                    bVar5.f59344B = "2131231207";
                    bVar5.f59354j = f;
                    bVar5.f59355k = i18;
                    view3 = view2;
                    bVar5.f59369y = new C22908r(0);
                    bVar5.f59370z = new C22898h(0);
                    bVar5.f59350f = C14050a.m13405b(d);
                    b2.mo32522k(d, imageView2, bVar5.mo32666a(), (C98661k) null, new C22906q(0, f, i18, true, false, (float) imageView2.getResources().getDimensionPixelSize(C0966R.dimen.f4277ye), aVar6));
                    View view14 = bVar.f203442d;
                    Drawable drawable = ReaderAppUI.this.getResources().getDrawable(C0966R.C0969drawable.f4783mt);
                    C74933u4.m89769f(drawable, this.f203421o.getResources().getColor(C0966R.color.f2929c));
                    view14.setBackground(drawable);
                    View view15 = bVar.f203442d;
                    int i19 = this.f203426t;
                    view15.setPadding(i19, this.f203427u, i19, i19);
                    bVar.f203449k.setVisibility(0);
                    i2 = 1;
                } else {
                    view3 = view2;
                    View view16 = bVar.f203441c;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(8);
                    View view17 = view16;
                    C117292a.m165358d(view17, aVar7.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view16.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view17, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar.f203440b.setVisibility(0);
                    bVar.f203444f.setVisibility(Util.isNullOrNil(h4Var3.mo105923d()) ? 8 : 0);
                    if (z) {
                        bVar.f203442d.setBackgroundResource(C0966R.C0969drawable.f4793n3);
                    } else {
                        bVar.f203442d.setBackgroundResource(C0966R.C0969drawable.f4791n1);
                    }
                    View view18 = bVar.f203442d;
                    int i25 = this.f203426t;
                    view18.setPadding(i25, i25, i25, i25);
                    bVar.f203449k.setVisibility(8);
                    i2 = 1;
                }
                if (i9 > i2) {
                    int i26 = 1;
                    while (true) {
                        i3 = i9 - 1;
                        if (i26 >= i3) {
                            break;
                        }
                        mo96993w(bVar, A, C0966R.C0971layout.bpo, i26, i, h4Var3.mo105924f());
                        i26++;
                        i9 = i9;
                    }
                    mo96993w(bVar, A, C0966R.C0971layout.bpn, i3, i, h4Var3.mo105924f());
                }
                C45700h hVar = (C45700h) C86709a0.m107533q(C45700h.class);
                if (hVar != null) {
                    hVar.mo71036ed(h4Var3.mo105926h(), 164, "wx073f4a4daff0abe8", h4Var3.mo105924f(), h4Var3.mo105923d(), StateEvent.Name.MESSAGE, 8);
                }
            } else {
                arrayList = arrayList3;
                view3 = view2;
            }
            bVar.f203445g.setTag(Integer.valueOf(i));
            bVar.f203445g.setTag(C0966R.C0970id.idn, 0);
            ReaderAppUI readerAppUI2 = ReaderAppUI.this;
            readerAppUI2.f203399q.mo108274i(bVar.f203445g, new C76358c(readerAppUI2, arrayList.size() == 1), ReaderAppUI.this.f203403u);
            Iterator it4 = ((ArrayList) bVar.f203450l).iterator();
            int i27 = 1;
            while (it4.hasNext()) {
                C70412a aVar8 = (C70412a) it4.next();
                aVar8.f203433a.setTag(Integer.valueOf(i));
                int i28 = i27 + 1;
                aVar8.f203433a.setTag(C0966R.C0970id.idn, Integer.valueOf(i27));
                ReaderAppUI readerAppUI3 = ReaderAppUI.this;
                readerAppUI3.f203399q.mo108274i(aVar8.f203433a, new C76358c(readerAppUI3, arrayList.size() == 1), ReaderAppUI.this.f203403u);
                i27 = i28;
            }
            return view3;
        }

        public int getViewTypeCount() {
            return this.f203419A;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            long currentTimeMillis = System.currentTimeMillis();
            this.f203423q = C76193l.yx0().mo105934qq(20);
            C75586j4 yx02 = C76193l.yx0();
            int i = this.f203422p;
            yx02.getClass();
            mo7998r(yx02.f222063d.rawQuery("SELECT reserved3 from (SELECT reserved3,time from " + yx02.mo105933kD(20) + " GROUP BY " + "reserved3" + " ORDER BY " + "time" + " DESC  LIMIT " + i + ") ORDER BY " + "time" + " ASC", (String[]) null));
            Log.m105925i("MicroMsg.ReaderAppUI", "[resetCursor] cost:%sms showCount:%s totalCount:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f203422p), Integer.valueOf(this.f203423q));
            notifyDataSetChanged();
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            super.onScrollStateChanged(absListView, i);
            if (absListView != null && i == 0) {
                mo96992u(absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
            }
        }

        /* renamed from: s */
        public int mo96990s() {
            return this.f203422p;
        }

        /* renamed from: t */
        public boolean mo96991t() {
            return this.f203422p >= this.f203423q;
        }

        /* renamed from: u */
        public void mo96992u(int i, int i2) {
            Log.m105927v("MicroMsg.ReaderAppUI", "[TRACE_PREFETCH] checkPreauth startPos = %s, endPos = %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i <= i2) {
                C45700h hVar = (C45700h) C86709a0.m107533q(C45700h.class);
                if (hVar == null) {
                    Log.m105926v("MicroMsg.ReaderAppUI", "checkPreauth WebPrefetcher null");
                    return;
                }
                LinkedList linkedList = new LinkedList();
                while (i <= i2) {
                    ArrayList arrayList = (ArrayList) mo96985A(i - 1);
                    if (arrayList.size() > 0) {
                        linkedList.clear();
                        C45700h.C45702b z = mo96995z((C75584h4) arrayList.get(0));
                        if (z != null) {
                            z.f123507d = 4;
                            linkedList.add(z);
                        }
                        if (linkedList.size() > 0) {
                            hVar.mo71026A3(linkedList, 8);
                        }
                        Log.m105927v("MicroMsg.ReaderAppUI", "[TRACE_PREFETCH] checkPreauth authTop = %s", Integer.valueOf(linkedList.size()));
                        linkedList.clear();
                        for (int i3 = 1; i3 < arrayList.size(); i3++) {
                            C45700h.C45702b z2 = mo96995z((C75584h4) arrayList.get(i3));
                            if (z2 != null) {
                                z2.f123507d = 5;
                                linkedList.add(z2);
                            }
                        }
                        if (linkedList.size() > 0) {
                            hVar.mo71026A3(linkedList, 16);
                        }
                        Log.m105927v("MicroMsg.ReaderAppUI", "[TRACE_PREFETCH] checkPreauth authCommon = %s", Integer.valueOf(linkedList.size()));
                    }
                    i++;
                }
            }
        }

        /* renamed from: w */
        public void mo96993w(C70413b bVar, List<C75584h4> list, int i, int i2, int i3, String str) {
            Drawable drawable;
            Drawable drawable2;
            C70413b bVar2 = bVar;
            List<C75584h4> list2 = list;
            int i4 = i;
            int i5 = i2;
            C70412a aVar = new C70412a(this);
            View inflate = View.inflate(this.f203421o, i4, (ViewGroup) null);
            aVar.f203433a = inflate;
            if (i4 == C0966R.C0971layout.bpo) {
                Drawable drawable3 = ReaderAppUI.this.getResources().getDrawable(C0966R.C0969drawable.f4790n0);
                AppCompatActivity context = ReaderAppUI.this.getContext();
                float f = C74942w4.f220334a;
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C0966R.attr.f2852qs, typedValue, true);
                ColorStateList c = C111105a.m151501c(context, typedValue.resourceId);
                if (drawable3 == null) {
                    drawable2 = null;
                } else {
                    drawable2 = C112019a.m152749g(drawable3);
                    drawable2.setTintList(c);
                }
                inflate.setBackground(drawable2);
            } else if (i4 == C0966R.C0971layout.bpn) {
                Drawable drawable4 = ReaderAppUI.this.getResources().getDrawable(C0966R.C0969drawable.f4789mz);
                AppCompatActivity context2 = ReaderAppUI.this.getContext();
                float f2 = C74942w4.f220334a;
                TypedValue typedValue2 = new TypedValue();
                context2.getTheme().resolveAttribute(C0966R.attr.f2852qs, typedValue2, true);
                ColorStateList c2 = C111105a.m151501c(context2, typedValue2.resourceId);
                if (drawable4 == null) {
                    drawable = null;
                } else {
                    drawable = C112019a.m152749g(drawable4);
                    drawable.setTintList(c2);
                }
                inflate.setBackground(drawable);
            }
            aVar.f203434b = (TextView) aVar.f203433a.findViewById(C0966R.C0970id.knx);
            aVar.f203436d = (ImageView) aVar.f203433a.findViewById(C0966R.C0970id.buo);
            aVar.f203435c = aVar.f203433a.findViewById(C0966R.C0970id.buq);
            aVar.f203437e = aVar.f203433a.findViewById(C0966R.C0970id.krm);
            aVar.f203438f = aVar.f203433a.findViewById(C0966R.C0970id.bs4);
            if (bVar2 != null) {
                bVar2.f203446h.addView(aVar.f203433a);
                ((ArrayList) bVar2.f203450l).add(aVar);
            }
            C75584h4 h4Var = list2.get(i5);
            int size = list.size();
            if (i5 != 1) {
                View view = aVar.f203437e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C75584h4 h4Var2 = list2.get(i5);
                if (Util.isNullOrNil(list2.get(i5 - 1).mo105922c()) || Util.isNullOrNil(h4Var2.mo105922c())) {
                    View view3 = aVar.f203437e;
                    int i6 = this.f203426t;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view3.getLayoutParams();
                    layoutParams.rightMargin = i6;
                    view3.setLayoutParams(layoutParams);
                } else {
                    View view4 = aVar.f203437e;
                    int i7 = this.f203431y;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                    layoutParams2.rightMargin = i7;
                    view4.setLayoutParams(layoutParams2);
                }
            } else if (Util.isNullOrNil(list2.get(0).mo105922c())) {
                View view5 = aVar.f203437e;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = aVar.f203437e;
                int i8 = this.f203426t;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view7.getLayoutParams();
                layoutParams3.rightMargin = i8;
                view7.setLayoutParams(layoutParams3);
            } else {
                View view8 = aVar.f203437e;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (i5 == 1) {
                if (i5 == size - 1) {
                    View view10 = aVar.f203438f;
                    int i9 = this.f203426t;
                    view10.setPadding(0, i9, 0, i9);
                } else {
                    aVar.f203438f.setPadding(0, this.f203426t, 0, this.f203425s);
                }
            } else if (i5 == size - 1) {
                aVar.f203438f.setPadding(0, this.f203425s, 0, this.f203426t);
            } else {
                View view11 = aVar.f203438f;
                int i15 = this.f203425s;
                view11.setPadding(0, i15, 0, i15);
            }
            aVar.f203434b.setText(h4Var.mo105924f());
            aVar.f203434b.setText(h4Var.mo105924f());
            if (!Util.isNullOrNil(h4Var.mo105922c())) {
                aVar.f203436d.setVisibility(0);
                String c3 = h4Var.mo105922c();
                ImageView imageView = aVar.f203436d;
                int i16 = this.f203430x;
                String d = C92856r0.m117118d(c3);
                C20828a b = C20828a.m22825b();
                C20937c.C20939b bVar3 = new C20937c.C20939b();
                bVar3.f59361q = C0966R.color.f3237k_;
                bVar3.f59346b = true;
                bVar3.f59354j = i16;
                bVar3.f59355k = i16;
                bVar3.f59369y = new C22908r(0);
                bVar3.f59370z = new C22898h(0);
                bVar3.f59350f = C14050a.m13405b(d);
                b.mo32522k(d, imageView, bVar3.mo32666a(), (C98661k) null, new C22906q(0, 0, (float[]) null, (C22909x0) null));
            } else {
                View view12 = aVar.f203435c;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view13 = view12;
                C117292a.m165358d(view13, aVar5.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ReaderAppUI readerAppUI = ReaderAppUI.this;
            aVar.f203433a.setOnClickListener(readerAppUI.mo96977I7(h4Var, readerAppUI.f203393h, i3, i2, str));
            C45700h hVar = (C45700h) C86709a0.m107533q(C45700h.class);
            if (hVar != null) {
                hVar.mo71036ed(h4Var.mo105926h(), 164, "wx073f4a4daff0abe8", h4Var.mo105924f(), h4Var.mo105923d(), StateEvent.Name.MESSAGE, 16);
            }
        }

        /* renamed from: x */
        public String getItem(int i) {
            return (String) super.getItem(i);
        }

        /* renamed from: z */
        public final C45700h.C45702b mo96995z(C75584h4 h4Var) {
            if (h4Var == null) {
                return null;
            }
            C45700h.C45702b bVar = new C45700h.C45702b();
            bVar.f123504a = h4Var.mo105926h();
            bVar.f123506c = 164;
            bVar.f123508e = "wx073f4a4daff0abe8";
            bVar.f123509f = h4Var.mo105924f();
            bVar.f123510g = h4Var.mo105923d();
            bVar.f123511h = StateEvent.Name.MESSAGE;
            return bVar;
        }
    }

    /* renamed from: H7 */
    public static String m82959H7(ReaderAppUI readerAppUI, String str) {
        readerAppUI.getClass();
        int i = 0;
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_append_url_params, 0) == 1;
        boolean B60 = ((C45696d) C86709a0.m107533q(C45696d.class)).B60(str);
        if (!z && !B60) {
            Log.m105924i("MicroMsg.ReaderAppUI", "appendArgsForNews appendParams false");
            return str;
        } else if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ReaderAppUI", "appendArgs fail, srcUrl is null");
            return "";
        } else {
            PackageInfo packageInfo = null;
            try {
                packageInfo = readerAppUI.getContext().getPackageManager().getPackageInfo("com.tencent.news", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.printErrStackTrace("MicroMsg.ReaderAppUI", e, "", new Object[0]);
            }
            if (packageInfo == null) {
                Log.m105924i("MicroMsg.ReaderAppUI", "isNewsInstallAndSupport false, pkgInfo is null");
            } else if (packageInfo.versionCode >= 220) {
                i = 1;
            }
            Log.m105924i("MicroMsg.ReaderAppUI", "appendArgsForNews, isNewsInstallAndSupport = " + i);
            LinkedList linkedList = new LinkedList();
            linkedList.add(new BasicNameValuePair("isappinstalled", i + ""));
            String format = URLEncodedUtils.format(linkedList, "utf-8");
            if (str.contains("?")) {
                return str + "&" + format;
            }
            return str + "?" + format;
        }
    }

    /* renamed from: I7 */
    public View.OnClickListener mo96977I7(C75584h4 h4Var, int i, int i2, int i3, String str) {
        if (h4Var != null) {
            String doUrlEncode = WebViewUtilities.doUrlEncode(h4Var.mo105926h());
            String doUrlEncode2 = WebViewUtilities.doUrlEncode(str);
            String doUrlEncode3 = WebViewUtilities.doUrlEncode(h4Var.mo105924f());
            C115669n nVar = C115669n.INSTANCE;
            h4Var.mo105927i();
            h4Var.mo105927i();
            h4Var.mo105927i();
            nVar.mo160131h(15413, 9, doUrlEncode2, doUrlEncode3, h4Var.f222058w, h4Var.mo105925g(), doUrlEncode, Integer.valueOf(h4Var.f222057v), Integer.valueOf(h4Var.f222056u));
        }
        return new C70402c(i, str, h4Var, i3);
    }

    /* renamed from: J7 */
    public void mo96978J7() {
        ScrollView scrollView = (ScrollView) findViewById(C0966R.C0970id.f357933cj2);
        if (this.f203392g.getCount() == 0) {
            this.f203390e.setVisibility(8);
            scrollView.setVisibility(0);
        } else {
            scrollView.setVisibility(8);
            this.f203390e.setVisibility(0);
        }
        C72917n0 n0Var = this.f203389d;
        if (n0Var != null && (this.f203392g instanceof C70411l)) {
            n0Var.post(new C70403d());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bpi;
    }

    public void initView() {
        try {
            this.f203397o = new C78404m(Util.convertStreamToString(getAssets().open("chatting/purecolor_chat.xml")), this);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ReaderAppUI", e, "", new Object[0]);
        }
        this.f203389d = (C72917n0) findViewById(C0966R.C0970id.idm);
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.ido);
        this.f203390e = mMPullDownView;
        mMPullDownView.setIsReturnSuperDispatchWhenCancel(true);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.bpj, (ViewGroup) null);
        this.f203391f = inflate;
        this.f203389d.addHeaderView(inflate);
        this.f203402t = (LinearLayout) findViewById(C0966R.C0970id.bsq);
        this.f203400r = (TextView) findViewById(C0966R.C0970id.mmn);
        this.f203401s = (TextView) findViewById(C0966R.C0970id.l7t);
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_readerapp_bottom_menu_show, 0) == 1;
        int i = 8;
        if (z) {
            this.f203394i = 17;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(15413, 17, "", "", "", "", "", 0, 0, this.f203395j);
            this.f203394i = 18;
            nVar.mo160131h(15413, 18, "", "", "", "", "", 0, 0, this.f203395j);
        }
        LinearLayout linearLayout = this.f203402t;
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        C70411l lVar = new C70411l(this, "");
        this.f203392g = lVar;
        this.f203389d.setOnScrollListener(lVar);
        this.f203389d.mo81290E(this.f203392g);
        this.f203389d.setTranscriptMode(0);
        registerForContextMenu(this.f203389d.mo81289D());
        C78253a aVar = new C78253a(this);
        this.f203399q = aVar;
        aVar.f229257z = true;
        this.f203390e.setOnTopLoadDataListener(new C70405f());
        this.f203390e.setTopViewVisible(true);
        this.f203390e.setAtBottomCallBack(new C70406g());
        this.f203390e.setAtTopCallBack(new C70407h());
        this.f203390e.setIsBottomShowAll(true);
        this.f203392g.f24699h = new C70408i();
        setBackBtn(new C70409j());
        addIconOptionMenu(0, (int) C0966R.string.f7371ea, (int) C0966R.raw.actionbar_setting_icon, (MenuItem.OnMenuItemClickListener) new C70410k());
        setNavigationbarColor(getResources().getColor(C0966R.color.f2928b));
        this.f203400r.setOnClickListener(new C70400a());
        this.f203401s.setOnClickListener(new C70401b());
        this.f203389d.setSelection((this.f203392g.mo96990s() - 1) + this.f203389d.getHeaderViewsCount());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("type", 0);
        this.f203393h = intExtra;
        Log.m105925i("MicroMsg.ReaderAppUI", "[onCreate] readerType:%s", Integer.valueOf(intExtra));
        this.f203393h = 20;
        f203388v = C76577a.m92156g(this);
        this.f203394i = 15;
        this.f203395j = C86493v0.m107223a("reader_app");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(15413, Integer.valueOf(this.f203394i), "", "", "", "", "", 0, 0, this.f203395j);
        long currentTimeMillis = System.currentTimeMillis();
        initView();
        Log.m105925i("MicroMsg.ReaderAppUI", "[initView] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        this.f203396n = C75584h4.m90717e(this.f203393h);
        if (20 == this.f203393h && C45629t0.m50817d("newsapp", (String[]) null) > 0) {
            nVar.mo160131h(13440, 2);
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.ReaderAppUI).mo86179qs(this, C76986a.ReaderAppUI);
    }

    public void onDestroy() {
        C76350a<String> aVar = this.f203392g;
        if (aVar != null) {
            aVar.mo5580b();
            this.f203392g.f24699h = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).f194715b = "";
        C76193l.yx0().remove(this.f203392g);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69778p0(this.f203396n);
    }

    public void onResume() {
        Class cls = C79690d.class;
        super.onResume();
        if (this.f203393h == 20) {
            setMMTitle((int) C0966R.string.fiq);
        } else {
            setMMTitle((int) C0966R.string.fit);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).f194715b = this.f203396n;
        ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93211h(this.f203396n);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69778p0(this.f203396n);
        C76193l.yx0().add(this.f203392g);
        this.f203392g.mo7991f();
        mo96978J7();
    }
}
