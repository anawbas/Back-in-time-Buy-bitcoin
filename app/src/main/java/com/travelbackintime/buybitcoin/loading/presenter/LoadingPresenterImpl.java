/*
 * Copyright 2018 Andrey Tolpeev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.travelbackintime.buybitcoin.loading.presenter;

import com.travelbackintime.buybitcoin.loading.router.LoadingRouter;
import com.travelbackintime.buybitcoin.loading.view.LoadingView;

import javax.inject.Inject;

public class LoadingPresenterImpl implements LoadingPresenter, LoadingView.GifListener {

    private final LoadingView view;
    private final LoadingRouter router;

    @Inject
    LoadingPresenterImpl(LoadingView view, LoadingRouter router) {
        this.view = view;
        this.router = router;
    }

    @Override
    public void handleOnCreate() {
        view.loadGif(this);
    }

    @Override
    public void onCompleted() {
        router.openHomeComingActivity();
    }
}
