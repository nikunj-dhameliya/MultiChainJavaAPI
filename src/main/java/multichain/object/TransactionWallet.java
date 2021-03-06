/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ub - H. MARTEAU
 * @version 2.0.1
 */
public class TransactionWallet {
  BalanceWalletTransaction balance = null;
  List<String> myaddresses = null;
  List<String> addresses = null;
  List<PermissionDetailed> permissions = null;
  Create create = null;
  AssetWalletTransaction issue = null;
  List<Item> items = null;
  Object data = null;
  Long confirmations = null;
  String blockhash = null;
  Long blockindex = null;
  Long blocktime = null;
  String txid = null;
  Boolean valid = null;
  Long time = null;
  Long timereceived = null;
  List<TransactionWalletVin> vin = null;
  List<TransactionWalletVout> vout = null;
  String hex = null;

  /**
   *
   */
  public TransactionWallet() {
    super();
    vin = new ArrayList<TransactionWalletVin>();
    vout = new ArrayList<TransactionWalletVout>();
    balance = new BalanceWalletTransaction();
    myaddresses = new ArrayList<String>();
    addresses = new ArrayList<String>();
    permissions = new ArrayList<PermissionDetailed>();
    issue = null;
    data = new Object();
    items = new ArrayList<>();

  }

  /**
   * @param base
   */
  public TransactionWallet(TransactionWallet wallet) {
    super();
    vin = new ArrayList<TransactionWalletVin>();
    vout = new ArrayList<TransactionWalletVout>();
    balance = wallet.getBalance();
    myaddresses = wallet.getAddresses();
    addresses = wallet.getAddresses();
    permissions = wallet.getPermissions();
    issue = wallet.getIssue();
    data = wallet.getData();
    items = wallet.getItems();
  }

  public TransactionWallet getTransactionWallet() {
    TransactionWallet wallet = new TransactionWallet();
    wallet.setBalance(balance);
    wallet.setAddresses(myaddresses);
    wallet.setAddresses(addresses);
    wallet.setPermissions(permissions);
    wallet.setIssue(issue);
    wallet.setData(data);
    wallet.setItems(items);

    return wallet;
  }



  /**
   * @return the vin
   */
  public List<TransactionWalletVin> getVin() {
    return vin;
  }

  /**
   * @param vin the vin to set
   */
  public void setVin(List<TransactionWalletVin> vin) {
    this.vin = vin;
  }

  public void addVin(TransactionWalletVin vin) {
    this.vin.add(vin);
  }

  /**
   * @return the vout
   */
  public List<TransactionWalletVout> getVout() {
    return vout;
  }

  /**
   * @param vout the vout to set
   */
  public void setVout(List<TransactionWalletVout> vout) {
    this.vout = vout;
  }

  public void addVout(TransactionWalletVout vout) {
    this.vout.add(vout);
  }

  /**
   * @return the hex
   */
  public String getHex() {
    return hex;
  }

  /**
   * @param hex the hex to set
   */
  public void setHex(String hex) {
    this.hex = hex;
  }

  /**
   * @return the balance
   */
  public BalanceWalletTransaction getBalance() {
    return balance;
  }

  /**
   * @param balance the balance to set
   */
  public void setBalance(BalanceWalletTransaction balance) {
    this.balance = balance;
  }

  /**
   * @return the myaddresses
   */
  public List<String> getMyaddresses() {
    return myaddresses;
  }

  /**
   * @param myaddresses the myaddresses to set
   */
  public void setMyaddresses(List<String> myaddresses) {
    this.myaddresses = myaddresses;
  }

  /**
   * @return the addresses
   */
  public List<String> getAddresses() {
    return addresses;
  }

  /**
   * @param addresses the addresses to set
   */
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   * @return the permissions
   */
  public List<PermissionDetailed> getPermissions() {
    return permissions;
  }

  /**
   * @param permissions the permissions to set
   */
  public void setPermissions(List<PermissionDetailed> permissions) {
    this.permissions = permissions;
  }

  /**
   * @return the issue
   */
  public AssetWalletTransaction getIssue() {
    return issue;
  }

  /**
   * @param issue the issue to set
   */
  public void setIssue(AssetWalletTransaction issue) {
    this.issue = issue;
  }

  /**
   * @return the items
   */
  public List<Item> getItems() {
    return items;
  }

  /**
   * @param items the items to set
   */
  public void setItems(List<Item> items) {
    this.items = items;
  }

  /**
   * @return the data
   */
  public Object getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(Object data) {
    this.data = data;
  }

  /**
   * @return the confirmations
   */
  public long getConfirmations() {
    return confirmations;
  }

  /**
   * @param confirmations the confirmations to set
   */
  public void setConfirmations(long confirmations) {
    this.confirmations = confirmations;
  }

  /**
   * @return the blockhash
   */
  public String getBlockhash() {
    return blockhash;
  }

  /**
   * @param blockhash the blockhash to set
   */
  public void setBlockhash(String blockhash) {
    this.blockhash = blockhash;
  }

  /**
   * @return the blockindex
   */
  public long getBlockindex() {
    return blockindex;
  }

  /**
   * @param blockindex the blockindex to set
   */
  public void setBlockindex(long blockindex) {
    this.blockindex = blockindex;
  }

  /**
   * @return the blocktime
   */
  public long getBlocktime() {
    return blocktime;
  }

  /**
   * @param blocktime the blocktime to set
   */
  public void setBlocktime(long blocktime) {
    this.blocktime = blocktime;
  }

  /**
   * @return the txid
   */
  public String getTxid() {
    return txid;
  }

  /**
   * @param txid the txid to set
   */
  public void setTxid(String txid) {
    this.txid = txid;
  }

  /**
   * @return the valid
   */
  public boolean isValid() {
    return valid;
  }

  /**
   * @param valid the valid to set
   */
  public void setValid(boolean valid) {
    this.valid = valid;
  }

  /**
   * @return the time
   */
  public long getTime() {
    return time;
  }

  /**
   * @param time the time to set
   */
  public void setTime(long time) {
    this.time = time;
  }

  /**
   * @return the timereceived
   */
  public long getTimereceived() {
    return timereceived;
  }

  /**
   * @param timereceived the timereceived to set
   */
  public void setTimereceived(long timereceived) {
    this.timereceived = timereceived;
  }

  /**
   * @return the create
   */
  public Create getCreate() {
    return create;
  }

  /**
   * @param create the create to set
   */
  public void setCreate(Create create) {
    this.create = create;
  }

  /**
   * @return the valid
   */
  public Boolean getValid() {
    return valid;
  }

  /**
   * @param valid the valid to set
   */
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   * @param confirmations the confirmations to set
   */
  public void setConfirmations(Long confirmations) {
    this.confirmations = confirmations;
  }

  /**
   * @param blockindex the blockindex to set
   */
  public void setBlockindex(Long blockindex) {
    this.blockindex = blockindex;
  }

  /**
   * @param blocktime the blocktime to set
   */
  public void setBlocktime(Long blocktime) {
    this.blocktime = blocktime;
  }

  /**
   * @param time the time to set
   */
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   * @param timereceived the timereceived to set
   */
  public void setTimereceived(Long timereceived) {
    this.timereceived = timereceived;
  }


}
