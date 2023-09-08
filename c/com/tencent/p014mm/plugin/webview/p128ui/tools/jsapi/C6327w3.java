package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6303r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.HashMap;
import k20.C9556a;
import p262wm.C15521d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3 */
public final class C6327w3 implements MMActivity.C6739d {

    /* renamed from: d */
    public int f23216d;

    /* renamed from: e */
    public boolean f23217e = false;

    /* renamed from: f */
    public int f23218f;

    /* renamed from: g */
    public C6333f f23219g;

    /* renamed from: h */
    public String f23220h;

    /* renamed from: i */
    public WeakReference<Context> f23221i;

    /* renamed from: j */
    public C6332e f23222j;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$a */
    public class C6328a implements Runnable {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$b */
    public static final class C6329b extends C6334g {
        public C6329b(C6328a aVar) {
            super((C6328a) null);
        }

        /* renamed from: a */
        public String mo7338a() {
            return C15521d.BaiduMap.mo14299a();
        }

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            if (context == null) {
                super.mo7339b(context, fVar, fVar2, str);
                return;
            }
            String format = String.format("baidumap://map/direction?destination=%f,%f&mode=driving", new Object[]{Double.valueOf(fVar2.f23223a), Double.valueOf(fVar2.f23224b)});
            if (fVar != null) {
                format = format + String.format("origin=%f,%f", new Object[]{Double.valueOf(fVar.f23223a), Double.valueOf(fVar.f23224b)});
            }
            Log.m105918d("MicroMsg.OpenMapNavigator", "url " + format);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format + "&src=webapp.car.carroutelistmappg.weixindrivenav"));
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$BaiduNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$BaiduNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.OpenMapNavigator", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$c */
    public static final class C6330c extends C6334g {
        public C6330c(C6328a aVar) {
            super((C6328a) null);
        }

        /* renamed from: a */
        public String mo7338a() {
            return C15521d.AutonaviMap.mo14299a();
        }

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            if (context == null) {
                super.mo7339b(context, fVar, fVar2, str);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=1&style=2", new Object[]{"MicroMessager", Double.valueOf(fVar2.f23223a), Double.valueOf(fVar2.f23224b)})));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(mo7338a());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GaodeNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GaodeNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$d */
    public static final class C6331d extends C6334g {
        public C6331d(C6328a aVar) {
            super((C6328a) null);
        }

        /* renamed from: a */
        public String mo7338a() {
            return C15521d.GoogleMap.mo14299a();
        }

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            if (context == null) {
                super.mo7339b(context, fVar, fVar2, str);
                return;
            }
            String format = String.format("http://maps.google.com/maps?f=d&daddr=%f,%f", new Object[]{Double.valueOf(fVar2.f23223a), Double.valueOf(fVar2.f23224b)});
            if (fVar != null) {
                format = format + String.format("&saddr=%f,%f", new Object[]{Double.valueOf(fVar.f23223a), Double.valueOf(fVar.f23224b)});
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GoogleNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$GoogleNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$e */
    public interface C6332e {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$f */
    public static final class C6333f {

        /* renamed from: a */
        public double f23223a;

        /* renamed from: b */
        public double f23224b;

        public C6333f(double d, double d2, C6328a aVar) {
            this.f23223a = d;
            this.f23224b = d2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$g */
    public static abstract class C6334g {
        public C6334g(C6328a aVar) {
        }

        /* renamed from: a */
        public abstract String mo7338a();

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            if (context != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + fVar2.f23223a + "," + fVar2.f23224b));
                intent.setPackage(mo7338a());
                intent.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$NavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$NavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$h */
    public static final class C6335h extends C6334g {
        public C6335h(C6328a aVar) {
            super((C6328a) null);
        }

        /* renamed from: a */
        public String mo7338a() {
            return C15521d.SogouMap.mo14299a();
        }

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            String str2;
            C6333f fVar3 = fVar;
            C6333f fVar4 = fVar2;
            if (context == null) {
                super.mo7339b(context, fVar, fVar2, str);
                return;
            }
            String format = String.format("wechatnav://type=nav&tocoord=%f,%f", new Object[]{Double.valueOf(fVar4.f23223a), Double.valueOf(fVar4.f23224b)});
            if (fVar3 != null) {
                str2 = format + String.format("&fromcoord=%f,%f", new Object[]{Double.valueOf(fVar3.f23223a), Double.valueOf(fVar3.f23224b)});
                if (!Util.isNullOrNil((String) null)) {
                    str2 = str2 + String.format("&from=%s", new Object[]{URLEncoder.encode((String) null)});
                }
            } else {
                str2 = format + String.format("&from=%s", new Object[]{AccessibleTouchItem.MY_LOCATION_PREFIX});
            }
            String str3 = !Util.isNullOrNil(str) ? str : !Util.isNullOrNil((String) null) ? null : "目的地";
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2 + String.format("&to=%s", new Object[]{str3})));
            intent.setPackage(mo7338a());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$SogouNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$SogouNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$i */
    public static final class C6336i extends C6334g {
        public C6336i(C6328a aVar) {
            super((C6328a) null);
        }

        /* renamed from: a */
        public String mo7338a() {
            return C15521d.TencentMap.mo14299a();
        }

        /* renamed from: b */
        public void mo7339b(Context context, C6333f fVar, C6333f fVar2, String str) {
            if (context == null) {
                super.mo7339b(context, fVar, fVar2, str);
                return;
            }
            String format = String.format("sosomap://type=nav&tocoord=%f,%f", new Object[]{Double.valueOf(fVar2.f23224b), Double.valueOf(fVar2.f23223a)});
            if (fVar != null) {
                format = format + String.format("fromcoord=%f,%f", new Object[]{Double.valueOf(fVar.f23224b), Double.valueOf(fVar.f23223a)});
                if (!Util.isNullOrNil((String) null)) {
                    format = format + String.format("&from=%s", new Object[]{URLEncoder.encode((String) null)});
                }
            }
            String str2 = !Util.isNullOrNil(str) ? str : !Util.isNullOrNil((String) null) ? null : "地图选点";
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((format + String.format("&to=%s", new Object[]{URLEncoder.encode(str2)})) + "&referer=wx_client"));
            intent.setPackage(mo7338a());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$TencentNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$TencentNavigateJumper", "goNavigate", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/OpenMapNavigator$Location;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        C6332e eVar;
        Context context = this.f23221i.get();
        C6332e eVar2 = this.f23222j;
        if (!(eVar2 == null || context == null)) {
            if (!this.f23217e) {
                Log.m105920e("MicroMsg.OpenMapNavigator", "onActivityResult called without msgId attached...");
            } else if (i != 33) {
                Log.m105921e("MicroMsg.OpenMapNavigator", "onActivityResult, mismatched request_code = %d", Integer.valueOf(i));
                ((C6303r0.C6304a) this.f23222j).mo7324a(this.f23216d, "fail");
            } else if (i2 == 4097 || i2 == 0) {
                ((C6303r0.C6304a) eVar2).mo7324a(this.f23216d, "cancel");
            } else if (i2 == -1) {
                String stringExtra = intent.getStringExtra("selectpkg");
                if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.OpenMapNavigator", "onActivityResult, get null packageName");
                    ((C6303r0.C6304a) this.f23222j).mo7324a(this.f23216d, "fail");
                } else {
                    (C15521d.GoogleMap.mo14299a().equals(stringExtra) ? new C6331d((C6328a) null) : C15521d.BaiduMap.mo14299a().equals(stringExtra) ? new C6329b((C6328a) null) : C15521d.SogouMap.mo14299a().equals(stringExtra) ? new C6335h((C6328a) null) : C15521d.AutonaviMap.mo14299a().equals(stringExtra) ? new C6330c((C6328a) null) : new C6336i((C6328a) null)).mo7339b(context, (C6333f) null, this.f23219g, this.f23220h);
                    ((C6303r0.C6304a) this.f23222j).mo7324a(this.f23216d, "ok");
                }
            } else {
                Log.m105921e("MicroMsg.OpenMapNavigator", "onActivityResult, not support result_code = %d", Integer.valueOf(i2));
                ((C6303r0.C6304a) this.f23222j).mo7324a(this.f23216d, "fail");
            }
        }
        if (this.f23217e && (eVar = this.f23222j) != null) {
            MsgHandler$$q0 msgHandler$$q0 = (MsgHandler$$q0) ((HashMap) C6303r0.this.f23152i.f22696Z).remove(Integer.valueOf(this.f23216d));
            if (msgHandler$$q0 != null) {
                msgHandler$$q0.f22846a = null;
                msgHandler$$q0.f22847b = null;
            }
        }
        this.f23217e = false;
        this.f23218f = 0;
        this.f23219g = null;
        this.f23221i = null;
        this.f23222j = null;
        this.f23220h = null;
    }
}
