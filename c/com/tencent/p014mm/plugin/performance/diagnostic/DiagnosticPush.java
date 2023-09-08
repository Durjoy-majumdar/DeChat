package com.tencent.p014mm.plugin.performance.diagnostic;

import android.text.TextUtils;
import ce2.C28544a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import h81.C32735h;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticPush */
public class DiagnosticPush {

    /* renamed from: a */
    public static final MultiProcessMMKV f81882a = MultiProcessMMKV.getMMKV("diagnostic_storage");

    /* renamed from: b */
    public static final String f81883b = ".cmd.diagnostic.$token";

    /* renamed from: c */
    public static final IListener<ExptChangeEvent> f81884c = new IListener<ExptChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -31521245;
        }

        public boolean callback(IEvent iEvent) {
            ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
            Log.m105924i("MicroMsg.DiagnosticPush", "expt changed");
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_diagnostic_expt_push_cmd, "");
            if (TextUtils.isEmpty(Y60)) {
                Log.m105920e("MicroMsg.DiagnosticPush", "empty push command");
            } else {
                Map<String, String> parseXml = XmlParser.parseXml(Y60, FileReaderHelper.OPEN_FILE_FROM_CMD, (String) null);
                if (parseXml == null) {
                    Log.m105921e("MicroMsg.DiagnosticPush", "invalid push command: %s", Y60);
                } else {
                    String str = DiagnosticPush.f81883b;
                    String str2 = parseXml.get(str);
                    MultiProcessMMKV multiProcessMMKV = DiagnosticPush.f81882a;
                    String decodeString = multiProcessMMKV.decodeString(str, "");
                    if (TextUtils.isEmpty(str2) || decodeString.equalsIgnoreCase(str2)) {
                        Log.m105925i("MicroMsg.DiagnosticPush", "ignore command, seq = %s, lastSeq = %s", str2, decodeString);
                    } else {
                        Log.m105925i("MicroMsg.DiagnosticPush", "valid push cmd: %s", Y60);
                        multiProcessMMKV.encode(str, str2);
                        C28544a.INSTANCE.mo56046b(parseXml);
                    }
                }
            }
            return false;
        }
    };

    static {
        C28544a.INSTANCE.getClass();
    }
}
