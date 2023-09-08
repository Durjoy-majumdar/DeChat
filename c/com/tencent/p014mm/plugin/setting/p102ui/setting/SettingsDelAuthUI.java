package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C42993r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import lb0.C88394b;
import nj3.C76912y0;
import p192l4.C10462b;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.io4;
import te3.jo4;
import um2.C52585b;
import xm2.C15862w;
import xm2.C38762v;
import ym2.C53544a;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI */
public final class SettingsDelAuthUI extends MMActivity {

    /* renamed from: d */
    public C42949a f116291d;

    /* renamed from: e */
    public io4 f116292e;

    /* renamed from: f */
    public C89779i0 f116293f;

    /* renamed from: g */
    public final C13601g f116294g = C36568h.m40985a(new C42955e(this));

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$a */
    public static final class C42949a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final Context f116295d;

        /* renamed from: e */
        public final RecyclerView f116296e;

        /* renamed from: f */
        public final List<jo4> f116297f = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$a$a */
        public static final class C42950a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final WeImageView f116298A;

            /* renamed from: z */
            public final TextView f116299z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C42950a(View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                this.f116299z = (TextView) view.findViewById(C0966R.C0970id.je5);
                this.f116298A = (WeImageView) view.findViewById(C0966R.C0970id.je6);
            }
        }

        public C42949a(Context context, RecyclerView recyclerView) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(recyclerView, "recyclerView");
            this.f116295d = context;
            this.f116296e = recyclerView;
        }

        public int getItemCount() {
            return ((ArrayList) this.f116297f).size();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
            if (r4.equals("snsapi_health_realtime") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
            if (r4.equals("group_sns_userinfo") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
            if (r4.equals("snsapi_message") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
            if (r4.equals("snsapi_contact") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
            if (r4.equals("snsapi_channels_livestream") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
            if (r4.equals("snsapi_channels_useraccountinfo") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
            if (r4.equals("snsapi_login") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
            if (r4.equals("group_sns_login") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
            if (r4.equals("snsapi_contact_message") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_chats;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
            if (r4.equals("snsapi_channels_watchstream") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
            if (r4.equals("snsapi_runtime_sdk") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ed, code lost:
            if (r4.equals("snsapi_runtime_apk") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
            if (r4.equals("snsapi_profile") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
            if (r4.equals("snsapi_channels_userinfo") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_channel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0131, code lost:
            if (r4.equals("snsapi_getruntimecode") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0134, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_me;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
            if (r4.equals("group_sns_friend") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0156, code lost:
            if (r4.equals("snsapi_userinfo") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_avatar;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
            if (r4.equals("snsapi_friend") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x017c, code lost:
            if (r4.equals("snsapi_health_industry") == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017f, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_sports;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0183, code lost:
            r1 = com.tencent.p014mm.C0966R.raw.icons_outlined_dot;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
            r3.setImageResource(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
            if (r4.equals("snsapi_health_history") == false) goto L_0x0183;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r3, r0)
                boolean r0 = r3 instanceof com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsDelAuthUI.C42949a.C42950a
                if (r0 == 0) goto L_0x0189
                com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$a$a r3 = (com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsDelAuthUI.C42949a.C42950a) r3
                java.util.List<te3.jo4> r0 = r2.f116297f
                java.lang.Object r4 = sx3.C110818d0.m150917O(r0, r4)
                te3.jo4 r4 = (te3.jo4) r4
                if (r4 != 0) goto L_0x0017
                goto L_0x0189
            L_0x0017:
                android.widget.TextView r0 = r3.f116299z
                java.lang.String r1 = r4.f136232e
                r0.setText(r1)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r3.f116298A
                java.lang.String r4 = r4.f136231d
                java.lang.String r0 = "authItem.scope"
                gy3.C87412m.m108593f(r4, r0)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r4 = r4.toLowerCase(r0)
                java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                gy3.C87412m.m108593f(r4, r0)
                int r0 = r4.hashCode()
                r1 = 2131756321(0x7f100521, float:1.9143546E38)
                switch(r0) {
                    case -1671801916: goto L_0x0175;
                    case -1258085413: goto L_0x016b;
                    case -1206855483: goto L_0x015d;
                    case -977063690: goto L_0x014f;
                    case -947167995: goto L_0x0146;
                    case -692793142: goto L_0x0138;
                    case -636224276: goto L_0x012a;
                    case -458655445: goto L_0x011c;
                    case -321109250: goto L_0x010c;
                    case -55273460: goto L_0x0101;
                    case 52634255: goto L_0x00f1;
                    case 65335832: goto L_0x00e6;
                    case 65352758: goto L_0x00db;
                    case 279310749: goto L_0x00d0;
                    case 487237195: goto L_0x00c0;
                    case 529085474: goto L_0x00b6;
                    case 657603212: goto L_0x00ab;
                    case 681993534: goto L_0x00a0;
                    case 820501715: goto L_0x0090;
                    case 1184620830: goto L_0x0085;
                    case 1205678723: goto L_0x007a;
                    case 1209077354: goto L_0x006f;
                    case 1461831584: goto L_0x0065;
                    case 1636810577: goto L_0x005a;
                    case 1936944122: goto L_0x004a;
                    case 2115829230: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x0183
            L_0x003f:
                java.lang.String r0 = "snsapi_health_history"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x017f
                goto L_0x0183
            L_0x004a:
                java.lang.String r0 = "snsapi_favorites"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0055
                goto L_0x0183
            L_0x0055:
                r1 = 2131756459(0x7f1005ab, float:1.9143826E38)
                goto L_0x0186
            L_0x005a:
                java.lang.String r0 = "snsapi_health_realtime"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x017f
                goto L_0x0183
            L_0x0065:
                java.lang.String r0 = "group_sns_userinfo"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0159
                goto L_0x0183
            L_0x006f:
                java.lang.String r0 = "snsapi_message"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00cb
                goto L_0x0183
            L_0x007a:
                java.lang.String r0 = "snsapi_contact"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0186
                goto L_0x0183
            L_0x0085:
                java.lang.String r0 = "snsapi_channels_livestream"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0126
                goto L_0x0183
            L_0x0090:
                java.lang.String r0 = "snsapi_stickers"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x009b
                goto L_0x0183
            L_0x009b:
                r1 = 2131756457(0x7f1005a9, float:1.9143822E38)
                goto L_0x0186
            L_0x00a0:
                java.lang.String r0 = "snsapi_channels_useraccountinfo"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0126
                goto L_0x0183
            L_0x00ab:
                java.lang.String r0 = "snsapi_login"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0159
                goto L_0x0183
            L_0x00b6:
                java.lang.String r0 = "group_sns_login"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0159
                goto L_0x0183
            L_0x00c0:
                java.lang.String r0 = "snsapi_contact_message"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00cb
                goto L_0x0183
            L_0x00cb:
                r1 = 2131756255(0x7f1004df, float:1.9143412E38)
                goto L_0x0186
            L_0x00d0:
                java.lang.String r0 = "snsapi_channels_watchstream"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0134
                goto L_0x0183
            L_0x00db:
                java.lang.String r0 = "snsapi_runtime_sdk"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0134
                goto L_0x0183
            L_0x00e6:
                java.lang.String r0 = "snsapi_runtime_apk"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0134
                goto L_0x0183
            L_0x00f1:
                java.lang.String r0 = "snsapi_wxaapp_info"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00fc
                goto L_0x0183
            L_0x00fc:
                r1 = 2131756359(0x7f100547, float:1.9143623E38)
                goto L_0x0186
            L_0x0101:
                java.lang.String r0 = "snsapi_profile"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0159
                goto L_0x0183
            L_0x010c:
                java.lang.String r0 = "snsapi_fav"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0117
                goto L_0x0183
            L_0x0117:
                r1 = 2131756303(0x7f10050f, float:1.914351E38)
                goto L_0x0186
            L_0x011c:
                java.lang.String r0 = "snsapi_channels_userinfo"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0126
                goto L_0x0183
            L_0x0126:
                r1 = 2131756246(0x7f1004d6, float:1.9143394E38)
                goto L_0x0186
            L_0x012a:
                java.lang.String r0 = "snsapi_getruntimecode"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0134
                goto L_0x0183
            L_0x0134:
                r1 = 2131756344(0x7f100538, float:1.9143593E38)
                goto L_0x0186
            L_0x0138:
                java.lang.String r0 = "snsapi_channels_recommend"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0142
                goto L_0x0183
            L_0x0142:
                r1 = 2131756378(0x7f10055a, float:1.9143662E38)
                goto L_0x0186
            L_0x0146:
                java.lang.String r0 = "group_sns_friend"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0186
                goto L_0x0183
            L_0x014f:
                java.lang.String r0 = "snsapi_userinfo"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0159
                goto L_0x0183
            L_0x0159:
                r1 = 2131756225(0x7f1004c1, float:1.9143352E38)
                goto L_0x0186
            L_0x015d:
                java.lang.String r0 = "webapi_getuserwxphone_group"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0167
                goto L_0x0183
            L_0x0167:
                r1 = 2131756245(0x7f1004d5, float:1.9143392E38)
                goto L_0x0186
            L_0x016b:
                java.lang.String r0 = "snsapi_friend"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0186
                goto L_0x0183
            L_0x0175:
                java.lang.String r0 = "snsapi_health_industry"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x017f
                goto L_0x0183
            L_0x017f:
                r1 = 2131756453(0x7f1005a5, float:1.9143814E38)
                goto L_0x0186
            L_0x0183:
                r1 = 2131756286(0x7f1004fe, float:1.9143475E38)
            L_0x0186:
                r3.setImageResource(r1)
            L_0x0189:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsDelAuthUI.C42949a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f116295d).inflate(C0966R.C0971layout.b57, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C42950a(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$b */
    public static final class C42951b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsDelAuthUI f116300d;

        public C42951b(SettingsDelAuthUI settingsDelAuthUI) {
            this.f116300d = settingsDelAuthUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116300d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$c */
    public static final class C42952c implements C42993r1.C42994a {

        /* renamed from: a */
        public final /* synthetic */ SettingsDelAuthUI f116301a;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$c$a */
        public static final class C42953a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SettingsDelAuthUI f116302d;

            public C42953a(SettingsDelAuthUI settingsDelAuthUI) {
                this.f116302d = settingsDelAuthUI;
            }

            public final void run() {
                this.f116302d.setResult(-1);
                this.f116302d.finish();
            }
        }

        public C42952c(SettingsDelAuthUI settingsDelAuthUI) {
            this.f116301a = settingsDelAuthUI;
        }

        /* renamed from: a */
        public void mo67139a(int i, int i2, String str) {
            C89779i0 i0Var = this.f116301a.f116293f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92767f(this.f116301a.getContext(), this.f116301a.getResources().getString(C0966R.string.iq9));
        }

        public void onSuccess() {
            C89779i0 i0Var = this.f116301a.f116293f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92768g(this.f116301a.getContext(), this.f116301a.getResources().getString(C0966R.string.iqa));
            C119179t tVar = C119157j.f356862d;
            C42953a aVar = new C42953a(this.f116301a);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 300, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$d */
    public static final class C42954d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsDelAuthUI f116303d;

        public C42954d(SettingsDelAuthUI settingsDelAuthUI) {
            this.f116303d = settingsDelAuthUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            io4 io4 = this.f116303d.f116292e;
            if (io4 != null) {
                C53544a.f150509a.mo74208a(205, io4);
            }
            SettingsDelAuthUI settingsDelAuthUI = this.f116303d;
            C77407n nVar = new C77407n((Context) settingsDelAuthUI.getContext(), 1, true);
            String string = settingsDelAuthUI.getResources().getString(C0966R.string.iq8);
            C87412m.m108593f(string, "resources.getString(R.st…h_del_auth_confirm_title)");
            Object[] objArr = new Object[1];
            io4 io42 = settingsDelAuthUI.f116292e;
            String str = io42 != null ? io42.f135549e : null;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "format(format, *args)");
            nVar.mo107568m(format, 17, C76577a.m92151b(settingsDelAuthUI, 14));
            nVar.f225771i = new C42987g2(settingsDelAuthUI);
            nVar.f225782p = new C42989h2(settingsDelAuthUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI$e */
    public static final class C42955e extends C87413o implements C32224a<C52585b> {

        /* renamed from: d */
        public final /* synthetic */ SettingsDelAuthUI f116304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42955e(SettingsDelAuthUI settingsDelAuthUI) {
            super(0);
            this.f116304d = settingsDelAuthUI;
        }

        public Object invoke() {
            View findViewById = this.f116304d.findViewById(C0966R.C0970id.mhj);
            int i = C0966R.C0970id.jds;
            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) C10462b.m10395a(findViewById, C0966R.C0970id.jds);
            if (mMRoundCornerImageView != null) {
                i = C0966R.C0970id.jdt;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jdt);
                if (linearLayout != null) {
                    i = C0966R.C0970id.jdu;
                    MMNeat7extView mMNeat7extView = (MMNeat7extView) C10462b.m10395a(findViewById, C0966R.C0970id.jdu);
                    if (mMNeat7extView != null) {
                        i = C0966R.C0970id.jdv;
                        TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.jdv);
                        if (textView != null) {
                            i = C0966R.C0970id.jdw;
                            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.jdw);
                            if (button != null) {
                                i = C0966R.C0970id.jdx;
                                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.jdx);
                                if (textView2 != null) {
                                    i = C0966R.C0970id.f359173je2;
                                    RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.f359173je2);
                                    if (recyclerView != null) {
                                        ScrollView scrollView = (ScrollView) findViewById;
                                        return new C52585b(scrollView, mMRoundCornerImageView, linearLayout, mMNeat7extView, textView, button, textView2, recyclerView, scrollView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public final C52585b mo67150H7() {
        return (C52585b) ((C36570n) this.f116294g).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxb;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        String str2 = "";
        setMMTitle(str2);
        hideActionbarLine();
        setBackBtn(new C42951b(this));
        RecyclerView recyclerView = mo67150H7().f146881f;
        C87412m.m108593f(recyclerView, "settingsDelAuthBinding.s…sAuthItemAuthRecyclerview");
        this.f116291d = new C42949a(this, recyclerView);
        RecyclerView recyclerView2 = mo67150H7().f146881f;
        recyclerView2.setAdapter(this.f116291d);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        List list = null;
        recyclerView2.setItemAnimator((RecyclerView.C16616j) null);
        C0132m mVar = new C0132m(recyclerView2.getContext(), 1);
        mVar.mo128j(recyclerView2.getResources().getDrawable(C0966R.C0969drawable.a8l));
        recyclerView2.mo17085h0(mVar);
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        ((C42993r1) rVar.mo62444c(context).mo75002a(C42993r1.class)).f116405d = new C42952c(this);
        mo67150H7().f146879d.setOnClickListener(new C42954d(this));
        C85875k4.m106189j0(mo67150H7().f146880e.getPaint(), 0.8f);
        C85875k4.m106189j0(mo67150H7().f146879d.getPaint(), 0.8f);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_user_auth_app");
        if (byteArrayExtra != null) {
            io4 io4 = new io4();
            io4.parseFrom(byteArrayExtra);
            this.f116292e = io4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initUserAuthAppInfo appId: ");
        io4 io42 = this.f116292e;
        sb.append(io42 != null ? io42.f135548d : null);
        sb.append(", appName: ");
        io4 io43 = this.f116292e;
        sb.append(io43 != null ? io43.f135549e : null);
        sb.append(", appType: ");
        io4 io44 = this.f116292e;
        sb.append(io44 != null ? Integer.valueOf(io44.f135550f) : null);
        Log.m105924i("MicroMsg.SettingsDelAuthUI", sb.toString());
        MMNeat7extView mMNeat7extView = mo67150H7().f146877b;
        io4 io45 = this.f116292e;
        String str3 = io45 != null ? io45.f135549e : null;
        if (str3 == null) {
            str3 = str2;
        }
        mMNeat7extView.mo104279b(str3);
        TextView textView = mo67150H7().f146878c;
        io4 io46 = this.f116292e;
        if (!(io46 == null || (str = io46.f135553i) == null)) {
            str2 = str;
        }
        textView.setText(str2);
        int A = (((C76577a.m92145A(getContext()) - (getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0) * 2)) - getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv)) - getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df)) - getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
        int i = A / 2;
        int i2 = 0;
        Log.m105925i("MicroMsg.SettingsDelAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(A));
        MMNeat7extView mMNeat7extView2 = mo67150H7().f146877b;
        C87412m.m108593f(mMNeat7extView2, "settingsDelAuthBinding.settingsAuthAppName");
        TextView textView2 = mo67150H7().f146878c;
        C87412m.m108593f(textView2, "settingsDelAuthBinding.settingsAuthAppType");
        C15862w.m14786a(mMNeat7extView2, textView2, A, i, i, false);
        MMRoundCornerImageView mMRoundCornerImageView = mo67150H7().f146876a;
        io4 io47 = this.f116292e;
        if (((io47 != null ? io47.f135550f : 0) & 1) != 0) {
            mMRoundCornerImageView.setRadius(mMRoundCornerImageView.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll));
        } else {
            mMRoundCornerImageView.setRadius(mMRoundCornerImageView.getResources().getDimensionPixelSize(C0966R.dimen.f3723cd));
        }
        String str4 = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        io4 io48 = this.f116292e;
        bVar.mo122785a(mMRoundCornerImageView, io48 != null ? io48.f135556o : null, C0966R.color.f2967ax, (C88394b.C88408j) null);
        io4 io49 = this.f116292e;
        String str5 = io49 != null ? io49.f135557p : null;
        if (!(str5 == null || str5.length() == 0)) {
            TextView textView3 = mo67150H7().f146880e;
            io4 io410 = this.f116292e;
            textView3.setText(io410 != null ? io410.f135557p : null);
        } else {
            mo67150H7().f146880e.setText(getResources().getString(C0966R.string.iqb));
        }
        io4 io411 = this.f116292e;
        if (io411 != null) {
            list = io411.f135551g;
        }
        if (list == null) {
            list = new ArrayList();
        }
        C42949a aVar = this.f116291d;
        if (aVar != null) {
            List<jo4> a = C38762v.m41920a(list);
            ((ArrayList) aVar.f116297f).clear();
            ((ArrayList) aVar.f116297f).addAll(a);
            Log.m105924i("MicroMsg.SettingsDelAuthUI", "setAuthScopeList final size: " + ((ArrayList) aVar.f116297f).size() + ", originSize: " + list.size());
            RecyclerView recyclerView3 = aVar.f116296e;
            if (!(!((ArrayList) aVar.f116297f).isEmpty())) {
                i2 = 8;
            }
            recyclerView3.setVisibility(i2);
            aVar.notifyDataSetChanged();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        ((C42993r1) rVar.mo62444c(context).mo75002a(C42993r1.class)).f116405d = null;
    }

    public void onResume() {
        super.onResume();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C42993r1.class);
    }
}
