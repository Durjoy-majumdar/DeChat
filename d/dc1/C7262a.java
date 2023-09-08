package dc1;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import cc1.C92413a;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p214om.C11502f;

/* renamed from: dc1.a */
public final class C7262a {

    /* renamed from: a */
    public Context f25323a;

    /* renamed from: b */
    public C92413a f25324b;

    public C7262a(Context context, C92413a aVar) {
        this.f25323a = context;
        this.f25324b = aVar;
    }

    @JavascriptInterface
    public void doImgPreview(String str) {
        C86009m1 m1Var = new C86009m1(Uri.parse(str));
        if (!m1Var.mo119967g()) {
            Log.m105925i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s no exist", str);
        } else if (ImgUtil.isGif(m1Var.mo119976n())) {
            Log.m105919d("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s is a gif", str);
        } else {
            Log.m105925i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s", str);
            List<String> stringToList = Util.stringToList(this.f25324b.field_imgPaths, ",");
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < stringToList.size(); i2++) {
                String str2 = this.f25324b.field_imgDirPath + "/" + stringToList.get(i2);
                if (!ImgUtil.isGif(str2)) {
                    arrayList.add(str2);
                    if (!z && !Util.isNullOrNil(str) && str.endsWith(stringToList.get(i2))) {
                        z = true;
                    } else if (!z) {
                        i++;
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                strArr[i3] = (String) arrayList.get(i3);
                if (Util.isEqual((String) arrayList.get(i3), m1Var.getName())) {
                    i = i3;
                }
            }
            Intent intent = new Intent();
            intent.putExtra("nowUrlPath", str);
            intent.putExtra("nowUrl", strArr[i]);
            intent.putExtra("urlList", strArr);
            intent.putExtra("type", -255);
            intent.putExtra("isFromWebView", true);
            intent.putExtra("currentPos", i);
            intent.putExtra("shouldShowScanQrCodeMenu", false);
            if (this.f25323a instanceof Service) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("stat_scene", 4);
            bundle.putString("stat_url", "");
            intent.putExtra("_stat_obj", bundle);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93182o(intent, this.f25323a);
        }
    }
}
