package com.tencent.p014mm.plugin.account.p024ui;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.p014mm.plugin.account.model.VoiceActionService;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.account.ui.VoiceActionActivity */
public class VoiceActionActivity extends SearchActionVerificationClientActivity {
    /* renamed from: E7 */
    public Class<? extends SearchActionVerificationClientService> mo847E7() {
        Log.m105918d("MicroMsg.VoiceActionActivity", "getServiceClass");
        return VoiceActionService.class;
    }
}
