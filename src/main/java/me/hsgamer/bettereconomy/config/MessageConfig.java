package me.hsgamer.bettereconomy.config;

import me.hsgamer.hscore.config.annotation.ConfigPath;

public interface MessageConfig {
    @ConfigPath("prefix")
    default String getPrefix() {
        return "&#FF8600&lʙ&#FF8D0E&lᴇ&#FF931C&lᴛ&#FF9A2A&lᴛ&#FFA038&lᴇ&#FFA746&lʀ&#FFAE54&lᴇ&#FFB461&lᴄ&#FFBB6F&lᴏ&#FFC17D&lɴ&#FFC88B&lᴏ&#FFCE99&lᴍ&#FFD5A7&lʏ &8» ";
    }

    @ConfigPath("player-not-found")
    default String getPlayerNotFound() {
        return "&fThat player does not exist, Please select the correct player.";
    }

    @ConfigPath("player-only")
    default String getPlayerOnly() {
        return "&cThis command is for player only";
    }

    @ConfigPath("empty-player-selector")
    default String getEmptyPlayerSelector() {
        return "&fPlease select a player.";
    }

    @ConfigPath("balance-output")
    default String getBalanceOutput() {
        return "&fYour balance is currently &a${balance}&f!";
    }

    @ConfigPath("balance-top-output")
    default String getBalanceTopOutput() {
        return "&f#{place} &a{name}: &f${balance}";
    }

    @ConfigPath("empty-balance-top")
    default String getEmptyBalanceTop() {
        return "&fNo one is on balance top. Become First!";
    }

    @ConfigPath("invalid-amount")
    default String getInvalidAmount() {
        return "&fNot a valid amount.";
    }

    @ConfigPath("give-success")
    default String getGiveSuccess() {
        return "&e@{name} &fhas recieved &a${balance}&f!";
    }

    @ConfigPath("receive")
    default String getReceive() {
        return "&fYou received &a${balance} &ffrom &e@{name}&f!";
    }

    @ConfigPath("take-success")
    default String getTakeSuccess() {
        return "&fSuccessfully took &a${balance} &ffrom &e@{name}&f!";
    }

    @ConfigPath("set-success")
    default String getSetSuccess() {
        return "&fSet balance of &e@{name} &fto &a${balance}&f!";
    }

    @ConfigPath("give-fail")
    default String getGiveFail() {
        return "&fFailed to give &a${balance} &fto &e@{name}&f.";
    }

    @ConfigPath("take-fail")
    default String getTakeFail() {
        return "&fFailed to take &a${balance}&f from &e@{name}&f!";
    }

    @ConfigPath("set-fail")
    default String getSetFail() {
        return "&fFailed to set &a${balance}&f to &e@{name}&f!";
    }

    @ConfigPath("success")
    default String getSuccess() {
        return "&fThe plugin has been reloaded! Some features may require a full server restart.";
    }

    @ConfigPath("cannot-do")
    default String getCannotDo() {
        return "&fYou are not allowed to do that.";
    }

    void reloadConfig();
}