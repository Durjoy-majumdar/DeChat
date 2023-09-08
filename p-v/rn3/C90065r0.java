package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo;
import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import ht1.C87592u3;

/* renamed from: rn3.r0 */
public class C90065r0 implements C87592u3.C60207a {

    /* renamed from: a */
    public final /* synthetic */ WXStateJumpChannelProfileInfo f258732a;

    /* renamed from: b */
    public final /* synthetic */ WXStateSceneDataObject f258733b;

    /* renamed from: c */
    public final /* synthetic */ SendAppMessageWrapperUI f258734c;

    public C90065r0(SendAppMessageWrapperUI sendAppMessageWrapperUI, WXStateJumpChannelProfileInfo wXStateJumpChannelProfileInfo, WXStateSceneDataObject wXStateSceneDataObject) {
        this.f258734c = sendAppMessageWrapperUI;
        this.f258732a = wXStateJumpChannelProfileInfo;
        this.f258733b = wXStateSceneDataObject;
    }

    /* renamed from: a */
    public void mo124358a(int i, int i2, Object obj) {
        SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258734c;
        int i3 = SendAppMessageWrapperUI.f250361A;
        sendAppMessageWrapperUI.mo119869M7();
        if (this.f258734c.f250379x) {
            Log.m105928w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
            return;
        }
        Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact errType: %s, errCode: %s, ret: %s", Integer.valueOf(i), Integer.valueOf(i2), obj);
        if (i == 0 && i2 == 0 && (obj instanceof FinderContact)) {
            FinderContact finderContact = (FinderContact) obj;
            Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact success username: %s nickName:%s", finderContact.username, finderContact.nickname);
            WXStateJumpChannelProfileInfo wXStateJumpChannelProfileInfo = this.f258732a;
            wXStateJumpChannelProfileInfo.username = finderContact.username;
            WXStateSceneDataObject wXStateSceneDataObject = this.f258733b;
            wXStateSceneDataObject.stateJumpInfo = wXStateJumpChannelProfileInfo;
            this.f258734c.mo119871O7(wXStateSceneDataObject, (String) null, finderContact.headUrl, false, finderContact.nickname);
            return;
        }
        this.f258734c.mo119871O7(this.f258733b, (String) null, (String) null, true, "");
    }
}
