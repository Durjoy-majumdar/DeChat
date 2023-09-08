package iy1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.api.GameInputConfig;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jy1.C9543a;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import p749xh.C66261f3;
import rx3.C13598b0;
import sw1.C48473l;
import sx3.C64197v;

/* renamed from: iy1.g */
public final class C46380g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124975d;

    public C46380g(PostCommentDialogUI postCommentDialogUI) {
        this.f124975d = postCommentDialogUI;
    }

    public final void onClick(View view) {
        int i;
        char c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        PostCommentDialogUI postCommentDialogUI = this.f124975d;
        int i2 = PostCommentDialogUI.f113134G;
        postCommentDialogUI.getClass();
        JSONObject jSONObject = new JSONObject();
        GameInputConfig gameInputConfig = postCommentDialogUI.f113153s;
        jSONObject.put("gamecenter_identifier", gameInputConfig != null ? gameInputConfig.identifier : null);
        MMEditText mMEditText = postCommentDialogUI.f113142e;
        if (mMEditText != null) {
            jSONObject.put(MimeTypes.BASE_TYPE_TEXT, mMEditText.getText());
            jSONObject.put("atUserNameList", new JSONArray(postCommentDialogUI.f113138D.f113163c));
            String str = postCommentDialogUI.f113155u;
            if (!(str == null || str.length() == 0)) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                ArrayList c2 = C64197v.m75534c(postCommentDialogUI.f113155u);
                String str2 = C9543a.f29734a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    long currentTicks = Util.currentTicks();
                    StringBuilder sb = new StringBuilder();
                    String str4 = C9543a.f29734a;
                    sb.append(str4);
                    sb.append("microMsg.image.");
                    sb.append(currentTicks);
                    sb.append(".");
                    Iterator it4 = it;
                    sb.append(str3.hashCode() & 65535);
                    String sb4 = sb.toString();
                    String str5 = str4 + "microMsg.thumb." + currentTicks + "." + (str3.hashCode() & 65535);
                    if (((!Util.isNullOrNil(str3) && Exif.fromFile(str3).getOrientationInDegree() != 0) && BitmapUtil.convertImageFile(new C86009m1(str3), new C86009m1(sb4), Bitmap.CompressFormat.PNG)) || C86013q1.m106443d(str3, sb4, false) > 0) {
                        str3 = sb4;
                    }
                    WebViewJSSDKFileItem c3 = C6049n1.m5934c(str3, str5);
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str3);
                    c3.f283030p = imageOptions.outWidth;
                    c3.f283031q = imageOptions.outHeight;
                    ((WebViewJSSDKImageItem) c3).f22268w = ImgUtil.isGif(str3);
                    String str6 = c3.f283022e;
                    C6080m.Ax0().mo7009a(c3);
                    Log.m105925i("MicroMsg.GameCenterUtil", "now filepath is : %s, local id is : %s", str3, str6);
                    arrayList2.add(str6);
                    it = it4;
                }
                i = 2;
                String str7 = "";
                if (!Util.isNullOrNil((List) arrayList2)) {
                    JSONStringer jSONStringer = new JSONStringer();
                    try {
                        jSONStringer.array();
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            String str8 = (String) it5.next();
                            WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str8);
                            if (b instanceof WebViewJSSDKImageItem) {
                                jSONStringer.object();
                                jSONStringer.key(C66261f3.COL_LOCALID);
                                jSONStringer.value(str8);
                                jSONStringer.key("height");
                                jSONStringer.value(b.f283031q + str7);
                                jSONStringer.key("width");
                                jSONStringer.value(b.f283030p + str7);
                                jSONStringer.key("isGif");
                                jSONStringer.value(((WebViewJSSDKImageItem) b).f22268w);
                                jSONStringer.endObject();
                            }
                        }
                        jSONStringer.endArray();
                        str7 = jSONStringer.toString();
                    } catch (Exception e) {
                        c = 0;
                        Log.printErrStackTrace("MicroMsg.GameCenterUtil", e, str7, new Object[0]);
                    }
                }
                c = 0;
                Object[] objArr = new Object[1];
                objArr[c] = str7;
                Log.m105925i("MicroMsg.GameCenterUtil", "after parse to json data : %s", objArr);
                jSONObject2.put("imageInfo", new JSONArray(str7));
                jSONArray.put(jSONObject2);
                jSONObject.put("imageArray", jSONArray);
            } else {
                i = 2;
                IEmojiInfo iEmojiInfo = postCommentDialogUI.f113154t;
                if (iEmojiInfo != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("emoticonMd5", iEmojiInfo.getMd5());
                    jSONObject4.put("productId", iEmojiInfo.getGroupId());
                    jSONObject4.put("encryptUrl", iEmojiInfo.mo62660g2());
                    jSONObject4.put("aesKey", iEmojiInfo.getAesKey());
                    jSONObject4.put("designerId", iEmojiInfo.mo62685o0());
                    C13598b0 b0Var = C13598b0.f38549a;
                    jSONObject3.put("emojiInfo", jSONObject4);
                    jSONArray2.put(jSONObject3);
                    jSONObject.put("imageArray", jSONArray2);
                } else {
                    jSONObject.put("imageArray", "[]");
                }
            }
            Log.m105924i("MicroMsg.PostCommentDialogUI", "setResultAndFinish jsonData = " + jSONObject);
            if (postCommentDialogUI.f113136B) {
                String str9 = WeChatProcess.PROCESS_TOOLS;
                Bundle bundle = new Bundle();
                GameInputConfig gameInputConfig2 = postCommentDialogUI.f113153s;
                bundle.putString("identifier", gameInputConfig2 != null ? gameInputConfig2.identifier : null);
                bundle.putString("jsonData", jSONObject.toString());
                C80907o.m98781d(str9, bundle, PostCommentDialogUI.C42006d.class, (C1256g) null);
            } else {
                C48473l lVar = C48473l.C48476c.f129682a;
                GameInputConfig gameInputConfig3 = postCommentDialogUI.f113153s;
                lVar.mo73119a(gameInputConfig3 != null ? gameInputConfig3.identifier : null, jSONObject);
            }
            HashMap hashMap = new HashMap();
            if (((ArrayList) postCommentDialogUI.f113138D.f113163c).size() != 0) {
                i = 1;
            }
            hashMap.put("comment_is_at", String.valueOf(i));
            hashMap.put("mention_num", String.valueOf(((ArrayList) postCommentDialogUI.f113138D.f113163c).size()));
            hashMap.put("comment_at_list", new JSONArray(postCommentDialogUI.f113138D.f113163c).toString());
            C40314g.m43484c(postCommentDialogUI.getContext(), 101, 2, 1, 48, 0, C40314g.m43483b(hashMap));
            postCommentDialogUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("gameCommentInputTxt");
        throw null;
    }
}
