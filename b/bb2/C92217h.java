package bb2;

import ab2.C67024c;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72711z;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.pigeon.FlutterSendMusicToChatPigeon;
import di3.C86312j;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p529fv.C75798k;

/* renamed from: bb2.h */
public final class C92217h extends FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction implements FlutterPlugin {
    public FlutterSendMusicToChatPigeon.SendMusicResponse getChatUserName() {
        FlutterSendMusicToChatPigeon.SendMusicResponse sendMusicResponse = new FlutterSendMusicToChatPigeon.SendMusicResponse();
        sendMusicResponse.setUserName("");
        C67024c V90 = ((C75798k) C86312j.m106911c(C75798k.class)).V90();
        if (V90 != null) {
            sendMusicResponse.setUserName(((C72711z) V90).f211574a);
        }
        return sendMusicResponse;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction.setup(flutterPluginBinding.getBinaryMessenger(), (FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction) null);
    }

    public void sendMusicToChat(FlutterSendMusicToChatPigeon.SendMusicRequest sendMusicRequest) {
        if (sendMusicRequest != null) {
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195582i = 3;
            bVar.f195570f = sendMusicRequest.getSongName();
            bVar.f195574g = sendMusicRequest.getSinger();
            String webUrl = sendMusicRequest.getWebUrl();
            if (webUrl == null) {
                webUrl = "";
            }
            bVar.f195586j = webUrl;
            bVar.f195590k = "";
            String dataUrl = sendMusicRequest.getDataUrl();
            if (dataUrl == null) {
                dataUrl = "";
            }
            bVar.f195530T = dataUrl;
            bVar.f195533U = "";
            bVar.f195562d = sendMusicRequest.getAppid();
            C72916m mVar = new C72916m();
            mVar.f212519b = sendMusicRequest.getCoverUrl();
            mVar.f212520c = sendMusicRequest.getLyric();
            mVar.f212533p = sendMusicRequest.getMid();
            mVar.f212523f = sendMusicRequest.getCoverUrl();
            bVar.mo93545f(mVar);
            C67024c V90 = ((C75798k) C86312j.m106911c(C75798k.class)).V90();
            if (V90 != null) {
                C72695v.m85052E(C68070l.C68072b.m80418i(bVar), bVar.f195562d, bVar.f195484F, ((C72711z) V90).f211574a, "", (byte[]) null);
            }
        }
    }
}
