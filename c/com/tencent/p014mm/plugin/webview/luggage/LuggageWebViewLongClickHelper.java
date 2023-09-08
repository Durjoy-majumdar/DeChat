package com.tencent.p014mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.scanner.C42902i;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebView;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import ea3.C45591h;
import eb0.C45628s0;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import j83.C9286a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import lc3.C10485b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p008bq.C67309t0;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46900z;
import p206nj.C88955f;
import p645pj.C77092c;
import p823sg.C90193h;
import pb1.C100714h1;
import qo3.C77407n;
import y83.C53505a;
import y83.C53508d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper */
public class LuggageWebViewLongClickHelper {

    /* renamed from: a */
    public String f117779a;

    /* renamed from: b */
    public int f117780b;

    /* renamed from: c */
    public int f117781c;

    /* renamed from: d */
    public WebView.HitTestResult f117782d;

    /* renamed from: e */
    public WebView.HitTestResult f117783e;

    /* renamed from: f */
    public C45591h f117784f;

    /* renamed from: g */
    public C77407n f117785g;

    /* renamed from: h */
    public C46900z f117786h;

    /* renamed from: i */
    public C43658n f117787i;

    /* renamed from: j */
    public C45591h.C45595d f117788j = new C43564b();

    /* renamed from: k */
    public C75018a.C75024d f117789k = new C43565c(this);

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$g */
    public static class C5868g implements C80883e<Bundle, Bundle> {
        private C5868g() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 1, bundle.getString("image_path", ""));
            doFavoriteEvent.publish();
            bundle.putInt("fav_simple_img_result", doFavoriteEvent.f264675e.f9046a);
            gVar.mo894a(bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$h */
    public static class C5869h implements C80916r<IPCBoolean, IPCBoolean> {
        private C5869h() {
        }

        public Object invoke(Object obj) {
            int i;
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            IPCBoolean iPCBoolean2 = new IPCBoolean();
            boolean z = true;
            try {
                i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EnableWebviewScanQRCode"), 1);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.LuggageWebViewLongClickHelper", "isAllowScanQRCode parseInt failed");
                i = 0;
            }
            if (i != 1) {
                z = false;
            }
            iPCBoolean2.f10312d = z;
            return iPCBoolean2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask */
    public static class QBarLogicTask implements C80883e<Bundle, Bundle> {

        /* renamed from: d */
        public C1256g f117790d;

        /* renamed from: e */
        public Map<String, Integer> f117791e;

        /* renamed from: f */
        public IListener f117792f;

        /* renamed from: g */
        public IListener f117793g;

        private QBarLogicTask() {
            C40008f fVar = C40008f.f107254d;
            this.f117792f = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
                {
                    this.__eventId = 812146647;
                }

                public boolean callback(IEvent iEvent) {
                    RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                    if (!(recogQBarOfImageFileResultEvent instanceof RecogQBarOfImageFileResultEvent)) {
                        return false;
                    }
                    Map<String, Integer> map = QBarLogicTask.this.f117791e;
                    if (map != null) {
                        if (!((HashMap) map).containsKey(recogQBarOfImageFileResultEvent.f265015d.f265016a)) {
                            return false;
                        }
                    }
                    Map<String, Integer> map2 = QBarLogicTask.this.f117791e;
                    if (map2 != null) {
                        ((HashMap) map2).remove(recogQBarOfImageFileResultEvent.f265015d.f265016a);
                    }
                    C86013q1.m106447h(recogQBarOfImageFileResultEvent.f265015d.f265016a);
                    C96874n1 n1Var = C96874n1.f283849a;
                    String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                    int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                    int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                    Log.m105918d("MicroMsg.QBarLogicTask", "result: " + d);
                    Bundle bundle = new Bundle();
                    bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, recogQBarOfImageFileResultEvent.f265015d.f265016a);
                    bundle.putString("result", d);
                    bundle.putInt("code_type", b);
                    bundle.putInt("code_version", c);
                    QBarLogicTask.this.f117790d.mo894a(bundle);
                    return false;
                }
            };
            this.f117793g = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
                {
                    this.__eventId = 1700407223;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
                    if (((java.util.HashMap) r0).containsKey(r5.f107738d.f107739a) == false) goto L_0x003c;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
                    /*
                        r4 = this;
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent r5 = (com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent) r5
                        com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask r0 = com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.QBarLogicTask.this
                        java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f117791e
                        r1 = 0
                        if (r0 == 0) goto L_0x0016
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent$a r2 = r5.f107738d
                        java.lang.String r2 = r2.f107739a
                        java.util.HashMap r0 = (java.util.HashMap) r0
                        boolean r0 = r0.containsKey(r2)
                        if (r0 != 0) goto L_0x0016
                        goto L_0x003c
                    L_0x0016:
                        com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask r0 = com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.QBarLogicTask.this
                        java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f117791e
                        if (r0 == 0) goto L_0x0025
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent$a r2 = r5.f107738d
                        java.lang.String r2 = r2.f107739a
                        java.util.HashMap r0 = (java.util.HashMap) r0
                        r0.remove(r2)
                    L_0x0025:
                        r0 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent$a r2 = r5.f107738d
                        java.lang.String r2 = r2.f107739a
                        r0[r1] = r2
                        java.lang.String r2 = "MicroMsg.QBarLogicTask"
                        java.lang.String r3 = "delete qb recog fail: %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent$a r5 = r5.f107738d
                        java.lang.String r5 = r5.f107739a
                        com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
                    L_0x003c:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.QBarLogicTask.C435622.callback(com.tencent.mm.sdk.event.IEvent):boolean");
                }
            };
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            this.f117790d = gVar;
            int i = bundle.getInt("type");
            String string = bundle.getString("img_path");
            int i2 = bundle.getInt("x_down");
            int i3 = bundle.getInt("y_down");
            int i4 = 1;
            if (i == 1) {
                if (this.f117791e == null) {
                    this.f117791e = new HashMap();
                    this.f117792f.alive();
                    this.f117793g.alive();
                }
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                c.mo120962i("key_basescanui_screen_x", Float.valueOf((float) i2));
                c.mo120962i("key_basescanui_screen_y", Float.valueOf((float) i3));
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
                aVar.f107733b = string;
                aVar.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.publish();
                ((HashMap) this.f117791e).put(string, 1);
            } else if (i == 2) {
                Map<String, Integer> map = this.f117791e;
                if (map == null || !((HashMap) map).containsKey(string)) {
                    Log.m105921e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
                    return;
                }
                CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
                cancelRecogImageFileEvent.f107390d.f107392b = string;
                cancelRecogImageFileEvent.publish();
                ((HashMap) this.f117791e).remove(string);
                C86013q1.m106447h(string);
            } else if (i == 3) {
                String string2 = bundle.getString("result");
                String string3 = bundle.getString("url");
                String string4 = bundle.getString("imageUrl");
                int i5 = bundle.getInt("codeType");
                int i6 = bundle.getInt("codeVersion");
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), WebviewScanImageActivity.class);
                intent.setFlags(872415232);
                intent.putExtra("key_string_for_scan", string2);
                intent.putExtra("key_string_for_url", string3);
                intent.putExtra("key_string_for_image_url", string4);
                intent.putExtra("key_codetype_for_scan", i5);
                intent.putExtra("key_codeversion_for_scan", i6);
                String string5 = bundle.getString("preUsername");
                String string6 = bundle.getString("preChatName");
                String string7 = bundle.getString("rawUrl");
                String a = C86493v0.m107223a("WebviewQrCode");
                C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(a, true);
                c2.mo120962i("preUsername", string5);
                c2.mo120962i("preChatName", string6);
                c2.mo120962i("url", string3);
                if (!((C45696d) C86709a0.m107533q(C45696d.class)).B60(string3)) {
                    i4 = 6;
                }
                c2.mo120962i("Contact_Sub_Scene", Integer.valueOf(i4));
                c2.mo120962i("Contact_Scene_Note", string3);
                c2.mo120962i("rawUrl", string7);
                intent.putExtra("img_gallery_session_id", a);
                String string8 = bundle.getString("pre_username");
                if (string8 != null && C45628s0.m50738C(string8)) {
                    intent.putExtra("key_string_for_from_username", string8);
                }
                Context context = MMApplicationContext.getContext();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (i == 4) {
                String string9 = bundle.getString("wxa_result");
                int i7 = bundle.getInt("wxa_code_type", 0);
                if (Util.isNullOrNil(string9)) {
                    Log.m105920e("MicroMsg.QBarLogicTask", "resultStr is null");
                    return;
                }
                C42902i iVar = (C42902i) ((C46896e0) C86312j.m106911c(C46896e0.class)).xp0();
                iVar.getClass();
                iVar.mo67099a(i7, new C46897s.C46898a(string9)).mo114038a(new C43596i1(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$a */
    public class C43563a implements C77407n.C47880p {
        public C43563a() {
        }

        public void onDismiss() {
            LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = LuggageWebViewLongClickHelper.this;
            if (luggageWebViewLongClickHelper.f117784f != null) {
                try {
                    luggageWebViewLongClickHelper.f117780b = 0;
                    luggageWebViewLongClickHelper.f117779a = null;
                    ((ScanCodeSheetItemLogic) luggageWebViewLongClickHelper.f117786h).mo67083n();
                    LuggageWebViewLongClickHelper luggageWebViewLongClickHelper2 = LuggageWebViewLongClickHelper.this;
                    String str = luggageWebViewLongClickHelper2.f117784f.f123310c;
                    luggageWebViewLongClickHelper2.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 2);
                    bundle.putString("img_path", str);
                    C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, QBarLogicTask.class, (C1256g) null);
                    LuggageWebViewLongClickHelper.this.f117784f.mo71114b();
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.LuggageWebViewLongClickHelper", "cancel capture failed");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$b */
    public class C43564b implements C45591h.C45595d {
        public C43564b() {
        }

        /* renamed from: a */
        public void mo64787a(String str) {
            LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = LuggageWebViewLongClickHelper.this;
            luggageWebViewLongClickHelper.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            bundle.putString("img_path", str);
            bundle.putInt("x_down", luggageWebViewLongClickHelper.f117787i.f117929R0);
            bundle.putInt("y_down", luggageWebViewLongClickHelper.f117787i.f117931S0);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, QBarLogicTask.class, new C43581e1(luggageWebViewLongClickHelper));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$c */
    public class C43565c implements C75018a.C75024d {
        public C43565c(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        }

        /* renamed from: a */
        public void mo7429a() {
            FavUrlTask favUrlTask = new FavUrlTask();
            favUrlTask.f283014f = 2;
            favUrlTask.mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$d */
    public class C43566d implements C46900z.C46901a {
        public C43566d() {
        }

        /* renamed from: a */
        public void mo64788a() {
            C77407n nVar = LuggageWebViewLongClickHelper.this.f117785g;
            if (nVar != null && nVar.mo107563h()) {
                LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = LuggageWebViewLongClickHelper.this;
                luggageWebViewLongClickHelper.getClass();
                MMHandlerThread.postToMainThread(new C43590g1(luggageWebViewLongClickHelper));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$e */
    public class C43567e implements C11182m0 {
        public C43567e() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = LuggageWebViewLongClickHelper.this;
            luggageWebViewLongClickHelper.getClass();
            boolean b = C6013c.m5890b();
            C43658n nVar = luggageWebViewLongClickHelper.f117787i;
            boolean e = nVar.f117922L.mo70839d(nVar.mo67943v()).mo69434e();
            C43658n nVar2 = luggageWebViewLongClickHelper.f117787i;
            boolean a = nVar2.f117922L.mo70839d(nVar2.mo67943v()).mo69429a();
            Log.m105925i("MicroMsg.LuggageWebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", Boolean.valueOf(b), Boolean.valueOf(e), Boolean.valueOf(a));
            ArrayList arrayList = new ArrayList();
            if (b && e) {
                arrayList.add(new C43569i(1, luggageWebViewLongClickHelper.f117787i.f148196d.getString(C0966R.string.hre)));
            }
            arrayList.add(new C43569i(2, luggageWebViewLongClickHelper.f117787i.f148196d.getString(C0966R.string.iaq)));
            if (b && a) {
                arrayList.add(new C43569i(3, luggageWebViewLongClickHelper.f117787i.f148196d.getString(C0966R.string.f361137hk2)));
            }
            String str = luggageWebViewLongClickHelper.f117779a;
            if (str != null) {
                arrayList.add(new C43569i(4, ((ScanCodeSheetItemLogic) luggageWebViewLongClickHelper.f117786h).mo67081l(luggageWebViewLongClickHelper.f117780b, str)));
            }
            luggageWebViewLongClickHelper.f117785g.mo107567l((View) null);
            e0Var.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                C43569i iVar = (C43569i) arrayList.get(i);
                int i2 = iVar.f117802a;
                if (i2 == 4) {
                    C77407n nVar3 = luggageWebViewLongClickHelper.f117785g;
                    C43573a1 a1Var = new C43573a1(luggageWebViewLongClickHelper);
                    nVar3.mo107567l(((ScanCodeSheetItemLogic) luggageWebViewLongClickHelper.f117786h).mo67071b(a1Var, luggageWebViewLongClickHelper.f117780b, luggageWebViewLongClickHelper.f117779a, 7));
                } else {
                    e0Var.mo107142f(i2, iVar.f117803b);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$f */
    public class C43568f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ String f117800d;

        public C43568f(String str) {
            this.f117800d = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = LuggageWebViewLongClickHelper.this;
                String str = this.f117800d;
                C44625c2.m49072e(luggageWebViewLongClickHelper.f117787i.f148196d, str, "", CookieManager.getInstance().getCookie(str), C88955f.m111058b(), new C43574b1(luggageWebViewLongClickHelper));
            } else if (itemId == 2) {
                LuggageWebViewLongClickHelper luggageWebViewLongClickHelper2 = LuggageWebViewLongClickHelper.this;
                String str2 = this.f117800d;
                C44625c2.m49077j(luggageWebViewLongClickHelper2.f117787i.f148196d, str2, "", CookieManager.getInstance().getCookie(str2), C88955f.m111058b());
            } else if (itemId == 3) {
                LuggageWebViewLongClickHelper luggageWebViewLongClickHelper3 = LuggageWebViewLongClickHelper.this;
                String str3 = this.f117800d;
                C44625c2.m49072e(luggageWebViewLongClickHelper3.f117787i.f148196d, str3, "", CookieManager.getInstance().getCookie(str3), C88955f.m111058b(), new C43579d1(luggageWebViewLongClickHelper3));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$i */
    public static final class C43569i {

        /* renamed from: a */
        public final int f117802a;

        /* renamed from: b */
        public final String f117803b;

        public C43569i(int i, String str) {
            this.f117802a = i;
            this.f117803b = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$j */
    public static class C43570j implements C53508d {

        /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$j$a */
        public class C43571a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C53505a f117804d;

            public C43571a(C43570j jVar, C53505a aVar) {
                this.f117804d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f117804d.onCallback((Bundle) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$j$b */
        public class C43572b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C53505a f117805d;

            public C43572b(C43570j jVar, C53505a aVar) {
                this.f117805d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f117805d.onCallback((Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo41063a(Context context, Bundle bundle, C53505a aVar) {
            Context context2 = context;
            C53505a aVar2 = aVar;
            Class cls = C67309t0.class;
            String string = bundle.getString("img_path");
            boolean z = false;
            if (ImgUtil.isGif(string)) {
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(C90193h.m112876d(string));
                if (Vs == null || !Vs.mo62633C1()) {
                    Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(((C67309t0) C86312j.m106911c(cls)).mo91190WE(MMApplicationContext.getContext(), string));
                }
                long l = Vs == null ? 0 : C86013q1.m106451l(Vs.mo62640K1());
                if (Vs != null) {
                    string = Vs.mo62640K1();
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if ((BitmapUtil.decodeFile(string, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c()) {
                    z = true;
                }
                String str = "";
                if (l > ((long) C77092c.m93039a()) || z) {
                    C76879j.m92754y(context2, context2.getString(C0966R.string.c5n), str, context2.getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null);
                    C76879j.m92709C(context, context2.getString(C0966R.string.c5n), "", context2.getString(C0966R.string.fmz), "", false, new C43571a(this, aVar2), new C43572b(this, aVar2));
                    return;
                }
                Intent intent = new Intent();
                if (Vs != null) {
                    str = Vs.getMd5();
                }
                intent.putExtra("Retr_File_Name", str);
                intent.putExtra("Retr_Msg_Type", 5);
                intent.putExtra("Retr_MsgImgScene", 1);
                ((C67654r1) C9286a.f29044a).mo93184q(intent, context2);
                aVar2.onCallback((Bundle) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Retr_File_Name", string);
            intent2.putExtra("Retr_Compress_Type", 0);
            intent2.putExtra("Retr_Msg_Type", 0);
            intent2.addFlags(268435456);
            ((C67654r1) C9286a.f29044a).mo93184q(intent2, context2);
            aVar2.onCallback((Bundle) null);
        }
    }

    public LuggageWebViewLongClickHelper(C43658n nVar) {
        this.f117787i = nVar;
        nVar.f117947q.setOnLongClickListener(new C43593h1(this));
        this.f117786h = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(nVar.f148196d, new C43566d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r0 = (com.tencent.p014mm.ipcinvoker.type.IPCBoolean) com.tencent.p014mm.ipcinvoker.C80907o.m98783f(com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN, null, com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.C5869h.class);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67862a() {
        /*
            r4 = this;
            com.tencent.mm.plugin.webview.luggage.n r0 = r4.f117787i
            d93.c r1 = r0.f117922L
            java.lang.String r0 = r0.mo67943v()
            com.tencent.mm.protocal.GeneralControlWrapper r0 = r1.mo70839d(r0)
            boolean r0 = r0.mo69432d()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            r2 = 0
            java.lang.Class<com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$h> r3 = com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.C5869h.class
            android.os.Parcelable r0 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r0, r2, r3)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = (com.tencent.p014mm.ipcinvoker.type.IPCBoolean) r0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.f10312d
            if (r0 == 0) goto L_0x0026
            r1 = 1
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper.mo67862a():boolean");
    }

    /* renamed from: b */
    public final boolean mo67863b(String str) {
        if (this.f117785g == null) {
            this.f117785g = new C77407n(this.f117787i.f148196d, 1, false);
        }
        C77407n nVar = this.f117785g;
        nVar.f225771i = new C43567e();
        nVar.f225782p = new C43568f(str);
        nVar.f225761d = new C43563a();
        if (!((Activity) this.f117787i.f148196d).isFinishing()) {
            this.f117785g.mo107573q();
        }
        return this.f117785g.mo107563h();
    }

    /* renamed from: c */
    public final boolean mo67864c(WebView.HitTestResult hitTestResult) {
        boolean b = mo67863b(hitTestResult.getExtra());
        if (Util.isNullOrNil(this.f117779a) && mo67862a()) {
            this.f117783e = hitTestResult;
            C45591h hVar = new C45591h();
            this.f117784f = hVar;
            hVar.mo71113a(this.f117787i.f117947q, this.f117788j);
        }
        return b;
    }

    /* renamed from: d */
    public final boolean mo67865d(WebView.HitTestResult hitTestResult) {
        boolean b = mo67863b(hitTestResult.getExtra());
        if (Util.isNullOrNil(this.f117779a) && mo67862a()) {
            this.f117782d = hitTestResult;
            C45591h hVar = new C45591h();
            this.f117784f = hVar;
            hVar.mo71113a(this.f117787i.f117947q, this.f117788j);
        }
        return b;
    }
}
