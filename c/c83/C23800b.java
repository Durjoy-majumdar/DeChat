package c83;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSessionInputStruct;
import u73.C22613h1;

/* renamed from: c83.b */
public class C23800b {
    /* renamed from: a */
    public static void m28600a(View view, int i, String str, String str2, int i2, String str3, String str4, int i3, long j) {
        WCTopicSessionInputStruct wCTopicSessionInputStruct = new WCTopicSessionInputStruct();
        wCTopicSessionInputStruct.f69642d = (long) i;
        wCTopicSessionInputStruct.f69643e = wCTopicSessionInputStruct.mo86045b("EnterSceneId", str, true);
        wCTopicSessionInputStruct.f69644f = wCTopicSessionInputStruct.mo86045b("RequestId", str2, true);
        wCTopicSessionInputStruct.f69645g = (long) i2;
        wCTopicSessionInputStruct.f69646h = wCTopicSessionInputStruct.mo86045b("QueryKey", str3, true);
        wCTopicSessionInputStruct.f69647i = wCTopicSessionInputStruct.mo86045b("SessionId", str4, true);
        wCTopicSessionInputStruct.f69648j = (long) i3;
        wCTopicSessionInputStruct.f69649k = j;
        wCTopicSessionInputStruct.mo86054n();
        C22613h1.m26490p(wCTopicSessionInputStruct);
    }
}
