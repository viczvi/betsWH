@PlaceBet
Feature: Place bet
  As a WH Customer
  I want the ability to place a bet on a English Premiere League event

  Scenario: Placing a bet on a championship event

  Given user logs in and navigates to the site and opens championship event
  When user places a "quantity" bet for win for the home team
  Then the odds and returns are displayed