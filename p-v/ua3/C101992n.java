package ua3;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.FavNoteSaveEvent;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import te3.C101801kd0;
import te3.C101835rd0;
import va3.C102166c;
import wa3.C102364c;
import wa3.C102368h;
import wa3.C102369i;
import wa3.C102370j;

/* renamed from: ua3.n */
public class C101992n extends IStaticListener<NotifyWNNoteOperationEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        C101835rd0 rd02;
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = (NotifyWNNoteOperationEvent) iEvent;
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        int i = aVar.f264944a;
        if (i == 0) {
            C102364c.vx0().mo137946Rd().mo141953o(notifyWNNoteOperationEvent);
        } else if (i == 2) {
            new FavNoteSaveEvent((Runnable) null).publish();
            C102370j jVar = new C102370j();
            jVar.f301476p = C102166c.m134609D0(notifyWNNoteOperationEvent.f264942d);
            jVar.f301477q = 1;
            C102364c.vx0().X00(jVar);
            long j = 0;
            if (notifyWNNoteOperationEvent.f264942d.f264954k != 4) {
                Log.m105924i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
                jVar.f301472i.f301480b = 1;
                NotifyWNNoteOperationEvent.C92535a aVar2 = notifyWNNoteOperationEvent.f264942d;
                boolean z = aVar2.f264954k == 5;
                C101801kd0 kd02 = aVar2.field_favProto;
                if (!(kd02 == null || (rd02 = kd02.f298616d) == null)) {
                    jVar.f301487C = rd02.f299346d;
                }
                Bundle bundle = aVar2.f264951h;
                if (bundle != null) {
                    jVar.f301488D = bundle.getLong("edittime", 0);
                    jVar.f301492H = notifyWNNoteOperationEvent.f264942d.f264951h.getByteArray("key_multi_task_common_info");
                }
                if (z) {
                    jVar.f301493I = true;
                    NotifyWNNoteOperationEvent.C92535a aVar3 = notifyWNNoteOperationEvent.f264942d;
                    long j2 = aVar3.field_localId;
                    Context context = aVar3.f264947d;
                    String str2 = aVar3.f264945b;
                    Boolean valueOf = Boolean.valueOf(aVar3.f264955l);
                    NotifyWNNoteOperationEvent.C92535a aVar4 = notifyWNNoteOperationEvent.f264942d;
                    jVar.mo141959s(j2, context, str2, valueOf, 0, 0, aVar4.f264956m, aVar4.field_favProto, jVar.f301492H);
                } else {
                    NotifyWNNoteOperationEvent.C92535a aVar5 = notifyWNNoteOperationEvent.f264942d;
                    long j3 = aVar5.field_localId;
                    Context context2 = aVar5.f264947d;
                    String str3 = aVar5.f264945b;
                    Boolean valueOf2 = Boolean.valueOf(aVar5.f264955l);
                    NotifyWNNoteOperationEvent.C92535a aVar6 = notifyWNNoteOperationEvent.f264942d;
                    jVar.mo141959s(j3, context2, str3, valueOf2, aVar6.f264946c, 0, aVar6.f264956m, (C101801kd0) null, jVar.f301492H);
                }
            } else {
                Log.m105924i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
                jVar.f301472i.f301480b = 4;
                NotifyWNNoteOperationEvent.C92535a aVar7 = notifyWNNoteOperationEvent.f264942d;
                Context context3 = aVar7.f264947d;
                C101801kd0 kd03 = aVar7.field_favProto;
                Bundle bundle2 = aVar7.f264951h;
                boolean z2 = aVar7.f264955l;
                String str4 = "";
                if (bundle2 != null) {
                    String string = bundle2.getString("noteauthor", str4);
                    str = bundle2.getString("noteeditor", str4);
                    j = bundle2.getLong("edittime", 0);
                    jVar.f301496v = bundle2.getString("snslocalid");
                    jVar.f301497w = bundle2.getString("notexml", str4);
                    jVar.f301492H = bundle2.getByteArray("key_multi_task_common_info");
                    jVar.f301490F = bundle2.getString("snsthumbpath", str4);
                    jVar.f301491G = bundle2.getString("snsnotelinkxml", str4);
                    str4 = string;
                } else {
                    str = str4;
                }
                jVar.f301495u = System.currentTimeMillis();
                jVar.f301499y = z2;
                jVar.f301474n = false;
                jVar.f301486B = str4 + ";" + str + ";" + j;
                jVar.mo141958r(context3, 4);
                C86709a0.m107525e().postToWorker(new C102369i(jVar, kd03));
            }
        } else if (i == 12) {
            new FavNoteSaveEvent((Runnable) null).publish();
        } else if (i == 9) {
            Log.m105924i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
            C102370j jVar2 = new C102370j();
            jVar2.f301476p = C102166c.m134609D0(notifyWNNoteOperationEvent.f264942d);
            jVar2.f301477q = 1;
            jVar2.f301495u = notifyWNNoteOperationEvent.f264942d.field_localId;
            jVar2.f301472i.f301480b = 1;
            C102364c.vx0().X00(jVar2);
            Context context4 = notifyWNNoteOperationEvent.f264942d.f264947d;
            jVar2.f301474n = true;
            jVar2.mo141958r(context4, 2);
        } else if (i == 10) {
            C102368h.m135077h(aVar.field_localId, aVar.f264953j);
        }
        return false;
    }
}
