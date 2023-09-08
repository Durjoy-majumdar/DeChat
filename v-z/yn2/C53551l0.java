package yn2;

import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.plugin.sns.model.C43040m0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import os2.C11765l0;

/* renamed from: yn2.l0 */
public class C53551l0 extends IStaticListener<PostSnsTagMemberOptionEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = (PostSnsTagMemberOptionEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.PostSnsTagMemberOptionListener", "PostSnsTagMemberOptionEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        } else if (!(postSnsTagMemberOptionEvent instanceof PostSnsTagMemberOptionEvent)) {
            Log.m105922f("MicroMsg.PostSnsTagMemberOptionListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        } else {
            PostSnsTagMemberOptionEvent.C40153a aVar = postSnsTagMemberOptionEvent.f107691d;
            List list = aVar.f107696e;
            if (list == null) {
                Log.m105920e("MicroMsg.PostSnsTagMemberOptionListener", "event.data.list is null!");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
            } else {
                boolean z2 = aVar.f107695d;
                if (z2) {
                    Log.m105925i("MicroMsg.PostSnsTagMemberOptionListener", "tag list is local %s", Boolean.valueOf(z2));
                    C11765l0 qq = C94866e1.ey0().mo11657qq(postSnsTagMemberOptionEvent.f107691d.f107693b);
                    qq.field_tagId = postSnsTagMemberOptionEvent.f107691d.f107693b;
                    ArrayList arrayList = new ArrayList();
                    if (!Util.isNullOrNil(qq.field_memberList)) {
                        arrayList.addAll(Util.stringsToList(qq.field_memberList.split(",")));
                    }
                    for (String add : postSnsTagMemberOptionEvent.f107691d.f107696e) {
                        arrayList.add(add);
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!Util.isNullOrNil(str)) {
                            stringBuffer.append(str + ",");
                        }
                    }
                    qq.field_memberList = stringBuffer.toString();
                    C94866e1.ey0().mo11652SE(qq);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                } else {
                    int i = aVar.f107692a;
                    long j = aVar.f107693b;
                    int size = list.size();
                    PostSnsTagMemberOptionEvent.C40153a aVar2 = postSnsTagMemberOptionEvent.f107691d;
                    C43040m0 m0Var = new C43040m0(i, j, "", size, aVar2.f107696e, aVar2.f107694c);
                    Log.m105924i("MicroMsg.PostSnsTagMemberOptionListener", "opCode " + postSnsTagMemberOptionEvent.f107691d.f107692a + " memberList " + postSnsTagMemberOptionEvent.f107691d.f107696e.size() + " scene " + postSnsTagMemberOptionEvent.f107691d.f107694c);
                    C86709a0.m107529k().f251779b.mo123460f(m0Var);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                }
                z = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        return z;
    }
}
