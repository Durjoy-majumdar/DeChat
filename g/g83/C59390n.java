package g83;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import c00.C92328i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import ke3.C88144b;
import nj3.C100127z;
import org.json.JSONObject;
import p652pu.C100910b;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import qo3.C101218e0;
import te3.C64719t23;
import te3.C64793w23;
import tm0.C78044d0;
import zt3.C119157j;

/* renamed from: g83.n */
public class C59390n {

    /* renamed from: a */
    public static final C59391a f169735a = new C59391a((C8480h) null);

    /* renamed from: g83.n$a */
    public static final class C59391a {

        /* renamed from: g83.n$a$a */
        public static final class C59392a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100127z f169736d;

            /* renamed from: e */
            public final /* synthetic */ C92328i f169737e;

            public C59392a(C100127z zVar, C92328i iVar) {
                this.f169736d = zVar;
                this.f169737e = iVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_comment_dialog", true).commit();
                C100127z zVar = this.f169736d;
                zVar.f293298S = true;
                zVar.mo140680z();
                C92328i iVar = this.f169737e;
                if (iVar != null) {
                    iVar.mo7502b();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: g83.n$a$b */
        public static final class C59393b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f169738d;

            /* renamed from: e */
            public final /* synthetic */ C100127z f169739e;

            /* renamed from: f */
            public final /* synthetic */ C92328i f169740f;

            public C59393b(C8477a0 a0Var, C100127z zVar, C92328i iVar) {
                this.f169738d = a0Var;
                this.f169739e = zVar;
                this.f169740f = iVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f169738d.f27482d = true;
                this.f169739e.mo140680z();
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_comment_dialog", false).commit();
                C92328i iVar = this.f169740f;
                if (iVar != null) {
                    iVar.mo7501a(this.f169739e.f293298S);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastCommentDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: g83.n$a$c */
        public static final class C59394c implements C101218e0.C77394n {

            /* renamed from: a */
            public final /* synthetic */ C100127z f169741a;

            /* renamed from: b */
            public final /* synthetic */ C8477a0 f169742b;

            /* renamed from: c */
            public final /* synthetic */ C92328i f169743c;

            public C59394c(C100127z zVar, C8477a0 a0Var, C92328i iVar) {
                this.f169741a = zVar;
                this.f169742b = a0Var;
                this.f169743c = iVar;
            }

            public final void dismiss() {
                if (!this.f169741a.f293298S && !this.f169742b.f27482d) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_comment_dialog", false).commit();
                    C92328i iVar = this.f169743c;
                    if (iVar != null) {
                        iVar.mo7501a(this.f169741a.f293298S);
                    }
                }
            }
        }

        /* renamed from: g83.n$a$d */
        public static final class C59395d implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100127z f169744d;

            /* renamed from: e */
            public final /* synthetic */ C92328i f169745e;

            public C59395d(C100127z zVar, C92328i iVar) {
                this.f169744d = zVar;
                this.f169745e = iVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C100127z zVar = this.f169744d;
                zVar.f293298S = true;
                zVar.mo140680z();
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_init_dialog", true).commit();
                C92328i iVar = this.f169745e;
                if (iVar != null) {
                    iVar.mo7502b();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: g83.n$a$e */
        public static final class C59396e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f169746d;

            /* renamed from: e */
            public final /* synthetic */ C100127z f169747e;

            /* renamed from: f */
            public final /* synthetic */ C92328i f169748f;

            public C59396e(C8477a0 a0Var, C100127z zVar, C92328i iVar) {
                this.f169746d = a0Var;
                this.f169747e = zVar;
                this.f169748f = iVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f169746d.f27482d = true;
                this.f169747e.mo140680z();
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_init_dialog", false).commit();
                C92328i iVar = this.f169748f;
                if (iVar != null) {
                    iVar.mo7501a(this.f169747e.f293298S);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/webview/WebSearchUtils$Companion$toastInitDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: g83.n$a$f */
        public static final class C59397f implements C101218e0.C77394n {

            /* renamed from: a */
            public final /* synthetic */ C100127z f169749a;

            /* renamed from: b */
            public final /* synthetic */ C8477a0 f169750b;

            /* renamed from: c */
            public final /* synthetic */ C92328i f169751c;

            public C59397f(C100127z zVar, C8477a0 a0Var, C92328i iVar) {
                this.f169749a = zVar;
                this.f169750b = a0Var;
                this.f169751c = iVar;
            }

            public final void dismiss() {
                if (!this.f169749a.f293298S && !this.f169750b.f27482d) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("tophitory_show_init_dialog", false).commit();
                    C92328i iVar = this.f169751c;
                    if (iVar != null) {
                        iVar.mo7501a(this.f169749a.f293298S);
                    }
                }
            }
        }

        public C59391a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo84514a(String str) {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            musicActionEvent.f264920d.f264922a = -2;
            musicActionEvent.publish();
            C101106m mVar = musicActionEvent.f264921e.f264930a;
            return mVar != null && C101093a.m132482d(mVar) && C87412m.m108589b(str, mVar.f295960e) && C101093a.m132481c();
        }

        /* renamed from: b */
        public final void mo84515b(JSONObject jSONObject, boolean z) {
            long j;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            long j2;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            JSONObject jSONObject2 = jSONObject;
            boolean z2 = z;
            C87412m.m108594g(jSONObject2, "paramsObj");
            Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "playSearchMusic " + jSONObject2 + " openMv:" + z2);
            String optString = jSONObject2.optString("musicId", "");
            String optString2 = jSONObject2.optString("songName", "");
            String optString3 = jSONObject2.optString("singerName", "");
            String optString4 = jSONObject2.optString("musicWebUrl", "");
            String optString5 = jSONObject2.optString("albumUrl", "");
            String optString6 = jSONObject2.optString("musicDataUrl", "");
            String optString7 = jSONObject2.optString("musicAppId", "");
            String optString8 = jSONObject2.optString("songLyric", "");
            String optString9 = jSONObject2.optString("albumName", "");
            String optString10 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_GENRE, "");
            String str16 = optString8;
            String str17 = optString4;
            String optString11 = jSONObject2.optString("identification", "");
            long optLong = jSONObject2.optLong("issueDate", 0);
            Class<C100910b> cls = C100910b.class;
            long optLong2 = jSONObject2.optLong("duration", 0);
            String optString12 = jSONObject2.optString(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, "");
            String str18 = optString10;
            jSONObject2.optInt(FFmpegMetadataRetriever.METADATA_KEY_COPYRIGHT, 0);
            String optString13 = jSONObject2.optString("mvObjectId", "");
            String optString14 = jSONObject2.optString("mvNonceId", "");
            long j3 = optLong2;
            String optString15 = jSONObject2.optString("mvCoverUrl", "");
            String optString16 = jSONObject2.optString("mvMakerFinderNickname", "");
            long j4 = optLong;
            String optString17 = jSONObject2.optString("musicOperationUrl", "");
            String optString18 = jSONObject2.optString("mid", "");
            String optString19 = jSONObject2.optString("sceneNote", "");
            if (!z2) {
                String str19 = optString17;
                String str20 = optString14;
                String str21 = optString5;
                String str22 = optString3;
                String str23 = optString;
                String str24 = str16;
                String str25 = optString11;
                String str26 = optString12;
                String str27 = str18;
                long j5 = j4;
                String str28 = optString9;
                String str29 = optString2;
                long j6 = j3;
                String str30 = optString15;
                String str31 = optString16;
                String str32 = str30;
                C87412m.m108593f(str23, "musicId");
                String str33 = optString18;
                if (!mo84514a(str23)) {
                    C64719t23 t232 = new C64719t23();
                    t232.f185459d = optString13;
                    t232.f185460e = str20;
                    t232.f185461f = str32;
                    t232.f185462g = str31;
                    t232.f185473u = str29;
                    t232.f185463h = str22;
                    t232.f185475w = str21;
                    t232.f185464i = str28;
                    t232.f185467o = j5;
                    t232.f185469q = (int) j6;
                    t232.f185468p = str25;
                    t232.f185474v = str24;
                    t232.f185466n = str27;
                    t232.f185465j = str26;
                    t232.f185471s = str19;
                    C62602o vQ = ((C100910b) C86312j.m106911c(cls)).mo139949vQ(str23, t232);
                    C101106m sL = ((C100910b) C86312j.m106911c(cls)).mo139948sL(9, str21, str29, str22, str17, "", optString6, str23, "", "", str28, optString7, vQ);
                    sL.f295954P = str33;
                    C101093a.m132488j(sL);
                    return;
                }
                C101093a.m132485g();
            } else if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76822Vm()) {
                C87412m.m108593f(optString, "musicId");
                if (!mo84514a(optString)) {
                    C64719t23 t233 = new C64719t23();
                    t233.f185459d = optString13;
                    t233.f185460e = optString14;
                    t233.f185461f = optString15;
                    t233.f185462g = optString16;
                    t233.f185473u = optString2;
                    t233.f185463h = optString3;
                    t233.f185475w = optString5;
                    t233.f185464i = optString9;
                    long j7 = j4;
                    t233.f185467o = j7;
                    String str34 = optString17;
                    String str35 = optString14;
                    t233.f185469q = (int) j3;
                    String str36 = optString11;
                    t233.f185468p = str36;
                    t233.f185474v = str16;
                    String str37 = str18;
                    t233.f185466n = str37;
                    String str38 = optString12;
                    t233.f185465j = str38;
                    C62602o vQ2 = ((C100910b) C86312j.m106911c(cls)).mo139949vQ(optString, t233);
                    j = j7;
                    str15 = optString18;
                    String str39 = str36;
                    str11 = optString19;
                    str9 = str38;
                    str14 = str39;
                    long j8 = j3;
                    str8 = str34;
                    str13 = str37;
                    str7 = str35;
                    str10 = optString9;
                    str5 = optString16;
                    str6 = str16;
                    j2 = j8;
                    str4 = optString15;
                    str3 = optString5;
                    str12 = optString3;
                    str2 = optString2;
                    str = optString;
                    C101106m sL2 = ((C100910b) C86312j.m106911c(cls)).mo139948sL(9, optString5, optString2, optString3, str17, "", optString6, optString, "", "", str10, optString7, vQ2);
                    sL2.f295954P = str15;
                    C101093a.m132488j(sL2);
                } else {
                    str8 = optString17;
                    str7 = optString14;
                    str5 = optString16;
                    str4 = optString15;
                    str3 = optString5;
                    str12 = optString3;
                    str2 = optString2;
                    str = optString;
                    str6 = str16;
                    str9 = optString12;
                    str13 = str18;
                    j2 = j3;
                    j = j4;
                    str15 = optString18;
                    str10 = optString9;
                    String str40 = optString11;
                    str11 = optString19;
                    str14 = str40;
                }
                Intent intent = new Intent();
                intent.putExtra("key_mv_song_name", str2);
                intent.putExtra("key_mv_song_lyric", str6);
                intent.putExtra("key_mv_album_cover_url", str3);
                intent.putExtra("key_mv_feed_id", optString13);
                intent.putExtra("key_mv_nonce_id", str7);
                intent.putExtra("key_mv_cover_url", str4);
                intent.putExtra("key_mv_poster", str5);
                intent.putExtra("key_mv_singer_name", str12);
                intent.putExtra("key_mv_album_name", str10);
                intent.putExtra("key_mv_music_genre", str13);
                intent.putExtra("key_mv_issue_date", String.valueOf(j));
                intent.putExtra("key_mv_identification", str14);
                intent.putExtra("key_mv_extra_info", str9);
                intent.putExtra("key_mv_music_duration", (int) j2);
                intent.putExtra("key_mv_music_operation_url", str8);
                intent.putExtra("key_mv_song_mid", str15);
                intent.putExtra("key_mv_scene_note", str11);
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186033d = 18;
                w232.f186036g = str;
                intent.putExtra("key_mv_report_data", w232.toByteArray());
                intent.setFlags(268435456);
                C88144b.m109791i(MMApplicationContext.getContext(), "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
            }
        }

        /* renamed from: c */
        public final void mo84516c(Context context, C92328i iVar, boolean z) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "callback");
            String string = context.getString(z ? C0966R.string.m0a : C0966R.string.m2h);
            C87412m.m108593f(string, "context.getString(if (is…ucation_comment_topstory)");
            C100127z zVar = new C100127z(context);
            zVar.f293296Q.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_news, context.getResources().getColor(C0966R.color.f2976b7)));
            zVar.f293296Q.setVisibility(0);
            C8477a0 a0Var = new C8477a0();
            zVar.f293292L.setText(string);
            zVar.f293292L.setVisibility(0);
            zVar.f293293M.setOnClickListener(new C59392a(zVar, iVar));
            zVar.f293294N.setOnClickListener(new C59393b(a0Var, zVar, iVar));
            zVar.f293293M.setText(context.getResources().getString(C0966R.string.f7569jy));
            zVar.mo140665l(new C59394c(zVar, a0Var, iVar));
            zVar.mo140655A();
            Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
        }

        /* renamed from: d */
        public final void mo84517d(Context context, C92328i iVar, String str) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "callback");
            C100127z zVar = new C100127z(context);
            zVar.f293296Q.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_news, context.getResources().getColor(C0966R.color.f2976b7)));
            zVar.f293296Q.setVisibility(0);
            zVar.f293295P.setImageDrawable(context.getDrawable(C0966R.C0969drawable.cg8));
            zVar.f293295P.setVisibility(0);
            C8477a0 a0Var = new C8477a0();
            zVar.f293292L.setText(str);
            zVar.f293292L.setVisibility(0);
            zVar.f293293M.setOnClickListener(new C59395d(zVar, iVar));
            zVar.f293294N.setOnClickListener(new C59396e(a0Var, zVar, iVar));
            zVar.f293293M.setText(context.getResources().getString(C0966R.string.f7569jy));
            zVar.mo140665l(new C59397f(zVar, a0Var, iVar));
            zVar.mo140655A();
            Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
        }

        /* renamed from: e */
        public final boolean mo84518e(String str) {
            int i;
            Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "vibrateShort , type = " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                Object obj = jSONObject.get("style");
                char c = C87412m.m108589b(obj, "light") ? 1 : C87412m.m108589b(obj, FirebaseAnalytics.C113379b.MEDIUM) ? 2 : C87412m.m108589b(obj, "heavy") ? (char) 3 : 65535;
                long j = 50;
                if (65534 == c) {
                    vibrator.vibrate(50);
                    return true;
                } else if (65535 == c) {
                    vibrator.vibrate(50);
                    return true;
                } else {
                    if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                        vibrator.vibrate(50);
                    } else {
                        if (c == 1) {
                            i = 128;
                            j = 15;
                        } else if (c == 2) {
                            i = 192;
                        } else if (c == 3) {
                            i = 255;
                            j = 85;
                        } else {
                            i = -1;
                        }
                        if (-1 == i) {
                            vibrator.vibrate(j);
                        } else {
                            vibrator.vibrate(VibrationEffect.createOneShot(j, i));
                        }
                    }
                    return true;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e, C78044d0.NAME, new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: a */
    public static final void m69304a(long j, long j2, long j3) {
        ((C119157j) C119157j.f356862d).mo183875f(new C59389m(j, j2, j3));
    }
}
