package com.nopalsoft.sharkadventure;

import com.nopalsoft.sharkadventure.handlers.FacebookHandler;
import com.nopalsoft.sharkadventure.handlers.GameServicesHandler;
import com.nopalsoft.sharkadventure.handlers.RequestHandler;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

public class IOSLauncher extends IOSApplication.Delegate implements FacebookHandler, RequestHandler, GameServicesHandler {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new MainShark(this, this, this), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }

    @Override
    public void facebookSignIn() {

    }

    @Override
    public void facebookSignOut() {

    }

    @Override
    public boolean facebookIsSignedIn() {
        return false;
    }

    @Override
    public void facebookShareFeed(String message) {

    }

    @Override
    public void showFacebook() {

    }

    @Override
    public void facebookInviteFriends(String message) {

    }

    @Override
    public void submitScore(long score) {

    }

    @Override
    public void unlockAchievement(String achievementId) {

    }

    @Override
    public void getLeaderboard() {

    }

    @Override
    public void getAchievements() {

    }

    @Override
    public boolean isSignedIn() {
        return false;
    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }

    @Override
    public void showRater() {

    }

    @Override
    public void showInterstitial() {

    }

    @Override
    public void showMoreGames() {

    }

    @Override
    public void shareOnTwitter(String mensaje) {

    }

    @Override
    public void removeAds() {

    }

    @Override
    public void showAdBanner() {

    }

    @Override
    public void hideAdBanner() {

    }

    @Override
    public void buy5milCoins() {

    }

    @Override
    public void buy15milCoins() {

    }

    @Override
    public void buy30milCoins() {

    }

    @Override
    public void buy50milCoins() {

    }
}